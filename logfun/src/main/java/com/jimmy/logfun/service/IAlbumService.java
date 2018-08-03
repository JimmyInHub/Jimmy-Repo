package com.jimmy.logfun.service;

import com.jimmy.logfun.domain.Album;
import com.jimmy.logfun.utils.ResultInfo;

/**
 * @ProjectName: Jimmy-Repo
 * @Package: com.jimmy.logfun.service
 * @ClassName: IAlbumService
 * @Description: 相册接口
 * @Author: Jimmy
 * @CreateDate: 2018/8/3 14:14
 * @UpdateUser:
 * @UpdateDate: 2018/8/3 14:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface IAlbumService {

    /**
     * @description: 保存/修改相册
     * @param: album
     * @date: 2018/8/3 16:24
     * @author: Jimmy
     */
    ResultInfo save(Album album);
}
