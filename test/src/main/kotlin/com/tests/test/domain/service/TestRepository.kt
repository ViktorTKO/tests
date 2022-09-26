package com.tests.test.domain.service

import com.tests.test.domain.entity.TestEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository:JpaRepository<TestEntity, Long> {
}