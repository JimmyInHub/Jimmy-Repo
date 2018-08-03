package com.jimmy.logfun.controller;

import com.jimmy.logfun.domain.Album;
import com.jimmy.logfun.service.IAlbumService;
import com.jimmy.logfun.utils.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 相册控制器
 * @fileName: AlbumController.java
 * @date: 2018/8/1 17:42
 * @author: Jimmy
 * @version: v1.0
 */
@Controller
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

	/**
	 * @description 跳转到首页
	 * @date: 2018/8/1 15:24
	 * @author: Jimmy
	 */
	@RequestMapping("/index")
	public String index(Model model) {
		return "/album/index";
	}

    /**
     * 保存/修改相册
     * @param album
     * @return
     * @author jimmy
     * @date 2018年8月3日
     */
    @RequestMapping("/save")
    @ResponseBody
    public ResultInfo save(Album album) {
        return albumService.save(album);
    }

}
