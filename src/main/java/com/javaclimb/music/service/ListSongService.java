package com.javaclimb.music.service;

import com.javaclimb.music.domain.ListSong;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface ListSongService {
    /*
     * 增加
     * */
    public boolean insert(ListSong listSong);
    /*
     * 修改
     * */
    public boolean update(ListSong listSong);
    /*
     * 删除
     * */
    public boolean delete(Integer id);
    /*
     * 根据歌曲id和歌单id删除
     * */
    public boolean deleteBySongIdAndSongListId(Integer songId, Integer songListId);

    /*
     * 根据主键查询所有歌单
     * */
    public ListSong selectByPrimaryKey(Integer id);
    /*
     * 查询所有歌单里面的歌曲
     * */
    public List<ListSong> allListSong();
    /*
     * 根据歌单id查询所有歌曲列表
     * */
    public List<ListSong> listSongOfSongListId(Integer songListId);
}
