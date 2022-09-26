package com.tests.test.service

import com.tests.test.domain.entity.TestEntity

interface TestService {
    fun saveTest(testEntity: TestEntity) : TestEntity
    fun deleteTestById(id: Long)
    fun getTestById(id: Long) : TestEntity
    fun patchTestById(id:Long, newTestEntity: TestEntity): TestEntity
    fun getAllTests() : List<TestEntity>
}