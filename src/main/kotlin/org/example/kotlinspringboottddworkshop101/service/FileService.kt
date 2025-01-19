package org.example.kotlinspringboottddworkshop101.service

import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class FileService {
    fun uploadFile(file: MultipartFile): String {
        return "Please implement upload file ..."
    }

    fun listFiles(): String {
        return "Please implement list files ..."
    }

    fun processFormat(id: Long, format: String): String {
        return "Please implement process format ..."
    }
}