package com.javaclimb.music.dao;

import com.javaclimb.music.domain.Singer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SingerMapper {
    /*
    * 增加
    * */
    public int insert(Singer singer);
    /*
     * 修改
     * */
    public int update(Singer singer);
    /*
     * 删除
     * */
    public int delete(Integer id);
    /*
     * 根据主键查询所有歌手
     * */
    public Singer selectByPrimaryKey (Integer id);
    /*
     * 查询所有歌手
     * */
    public List<Singer> allSinger();
    /*
     * 根据歌手名字模糊查询列表
     * */
    public List<Singer> singerOfName(String name);
    /*
     * 根据歌手性别查询列表
     * */
    public List<Singer> singerOfSex(Integer sex);
}
