package com.sky.fileserver.service;


import com.sky.fileserver.domain.File;
import com.sky.fileserver.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * File 服务.
 */
@Service
public class FileServiceImpl implements FileService {

    @Autowired
    public FileRepository fileRepository;


    @Override
    public File saveFile(File file) {
        return fileRepository.save(file);
    }

    @Override
    public void removeFile(String id) {
        fileRepository.deleteById(id);
    }

    /**
     * 删除存储库管理的所有实体
     */
    @Override
    public void deleteAll() {
        fileRepository.deleteAll();
    }

    @Override
    public Optional<File> getFileById(String id) {
        return fileRepository.findById(id);
    }

    @Override
    public List<File> listFilesByPage(int pageIndex, int pageSize) {
        Page<File> page = null;
        List<File> list = null;

        Sort sort = new Sort(Sort.Direction.DESC, "uploadDate");
        Pageable pageable = PageRequest.of(pageIndex, pageSize, sort);

        page = fileRepository.findAll(pageable);
        list = page.getContent();
        return list;
    }
}
