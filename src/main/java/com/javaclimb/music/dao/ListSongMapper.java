package com.javaclimb.music.dao;

import com.javaclimb.music.domain.ListSong;
import org.springframework.stereotype.Repository;

import java.util.List;

//歌单里的歌曲
@Repository
public interface ListSongMapper {
    /*
    * 增加
    * */
    public int insert(ListSong listSong);
    /*
     * 修改
     * */
    public int update(ListSong listSong);
    /*
     * 删除
     * */
    public int delete(Integer id);
    /*
     * 根据歌曲id和歌单id删除
     * */
    public int deleteBySongIdAndSongListId(Integer songId,Integer songListId);
    /*
     * 根据主键查询整个对象
     * */
    public ListSong selectByPrimaryKey(Integer id);
    /*
     * 查询歌单里的歌曲
     * */
    public List<ListSong> allListSong();

    /*
     * 根据歌单id查询所有歌曲列表
     * */
    public List<ListSong> listSongOfSongListId(Integer songListId);
}
