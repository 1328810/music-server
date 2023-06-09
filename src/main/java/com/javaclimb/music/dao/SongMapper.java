package com.javaclimb.music.dao;

import com.javaclimb.music.domain.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongMapper {
    /*
    * 增加
    * */
    public int insert(Song song);
    /*
     * 修改
     * */
    public int update(Song song);
    /*
     * 删除
     * */
    public int delete(Integer id);
    /*
     * 根据主键查询所有歌曲
     * */
    public Song selectByPrimaryKey(Integer id);
    /*
     * 查询所有歌曲
     * */
    public List<Song> allSong();
    /*
     * 根据歌曲名字查询列表
     * */
    public List<Song> songOfName(String name);
    /*
     * 根据歌曲id查询列表
     * */
    public List<Song> songOfSingerId(Integer singerId);
}
