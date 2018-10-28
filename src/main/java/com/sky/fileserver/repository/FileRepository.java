package com.sky.fileserver.repository;

import com.sky.fileserver.domain.File;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 * File 存储库.
 */
public interface FileRepository extends MongoRepository<File, String> {
}
