package com.jimmy.logfun.mapper;

import com.jimmy.logfun.domain.Album;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: Jimmy-Repo
 * @Package: com.jimmy.logfun.mapper
 * @ClassName: IAlbumMapper
 * @Description:
 * @Author: Jimmy
 * @CreateDate: 2018/8/3 14:25
 * @UpdateUser:
 * @UpdateDate: 2018/8/3 14:25
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Component
public interface IAlbumMapper {

    /**
     * @description: 相册保存/修改
     * @param: album
     * @date: 2018/8/3 14:27
     * @author: Jimmy
     */
    void save(Album album);

    /**
     * @description: 更新相册
     * @param: album
     * @date: 2018/8/3 14:28
     * @author: Jimmy
     */
    void update(Album album);
}
