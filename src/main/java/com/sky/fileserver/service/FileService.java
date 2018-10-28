/**
 *
 */
package com.sky.fileserver.service;

import com.sky.fileserver.domain.File;

import java.util.List;
import java.util.Optional;


/**
 * File 服务接口.
 */
public interface FileService {
    /**
     * 保存文件
     *
     * @param File
     * @return
     */
    File saveFile(File file);

    /**
     * 删除文件
     *
     * @param File
     * @return
     */
    void removeFile(String id);

    /**
     *  删除存储库管理的所有实体
     */
    void deleteAll();

    /**
     * 根据id获取文件
     *
     * @param File
     * @return
     */
    Optional<File> getFileById(String id);

    /**
     * 分页查询，按上传时间降序
     *
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<File> listFilesByPage(int pageIndex, int pageSize);
}
