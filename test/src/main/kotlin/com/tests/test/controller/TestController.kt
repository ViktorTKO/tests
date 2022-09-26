package com.tests.test.controller

import com.tests.test.domain.entity.TestEntity
import com.tests.test.service.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/tests")
class TestController(@Autowired val testService: TestService) {

    @GetMapping
    fun get(): ResponseEntity<List<TestEntity>> {
        val listOfTests = testService.getAllTests()
        return ResponseEntity.ok(listOfTests)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<TestEntity> {
        return ResponseEntity.ok(testService.getTestById(id))
    }

    @PostMapping
    fun create(@RequestBody testEntity: TestEntity): ResponseEntity<TestEntity> {
        return ResponseEntity.ok(testService.saveTest(testEntity))
    }

    @PatchMapping("/{id}")
    fun patch(@RequestBody id: Long, newTestEntity: TestEntity): ResponseEntity<TestEntity> {
        return ResponseEntity.ok(testService.patchTestById(id, newTestEntity))
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
        return ResponseEntity.ok(testService.deleteTestById(id))
    }
}