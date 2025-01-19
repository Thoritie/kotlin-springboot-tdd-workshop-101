package org.example.kotlinspringboottddworkshop101.repository

import org.example.kotlinspringboottddworkshop101.entity.File
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FileRepository : JpaRepository<File, Long>