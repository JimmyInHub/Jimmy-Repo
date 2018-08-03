package com.jimmy.logfun.service.impl;

import com.jimmy.logfun.domain.Album;
import com.jimmy.logfun.mapper.IAlbumMapper;
import com.jimmy.logfun.service.IAlbumService;
import com.jimmy.logfun.utils.Constants;
import com.jimmy.logfun.utils.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: Jimmy-Repo
 * @Package: com.jimmy.logfun.service.impl
 * @ClassName: AlbumServiceImpl
 * @Description:
 * @Author: Jimmy
 * @CreateDate: 2018/8/3 14:15
 * @UpdateUser:
 * @UpdateDate: 2018/8/3 14:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
@Transactional
public class AlbumServiceImpl implements IAlbumService {

    @Autowired
    private IAlbumMapper albumMapper;
    /**
     * @description: 保存/修改相册
     * @param: album
     * @date: 2018/8/3 16:24
     * @author: Jimmy
     */
    @Override
    public ResultInfo save(Album album) {
        ResultInfo resultInfo = new ResultInfo();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
        String updateTime = sdf.format(new Date());
        album.setAuthor("Jimmy");
        album.setUpdateName("Jimmy");
        album.setUpdateTime(updateTime);

        //  第一次保存时,创建时间和更新时间一致
        Long id = album.getId();
        if(id == null){
            album.setStatus(Constants.STATUS_VALID);
            album.setCreateTime(updateTime);
            album.setCreateName("Jimmy");
            album.setAuthor("Jimmy");
            albumMapper.save(album);
        }else{
            albumMapper.update(album);
        }
        return resultInfo;
    }
}
