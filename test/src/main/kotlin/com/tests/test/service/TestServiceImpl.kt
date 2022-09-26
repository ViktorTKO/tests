package com.tests.test.service

import com.tests.test.domain.entity.TestEntity
import com.tests.test.domain.service.TestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TestServiceImpl(@Autowired val testRepository: TestRepository): TestService {
    override fun saveTest(testEntity: TestEntity): TestEntity {
        testRepository.save(testEntity);
        return testEntity;
    }

    override fun deleteTestById(id: Long) {
        testRepository.deleteById(id)
    }

    override fun getTestById(id: Long): TestEntity {
        return testRepository.getReferenceById(id)
    }

    override fun patchTestById(id: Long, newTestEntity: TestEntity): TestEntity {
        val testEntity = testRepository.getReferenceById(id)
        return testRepository.save(testEntity)
    }

    override fun getAllTests(): List<TestEntity> {
        return testRepository.findAll()
    }
}