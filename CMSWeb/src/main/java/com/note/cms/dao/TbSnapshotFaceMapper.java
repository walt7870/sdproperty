package com.note.cms.dao;

import com.note.cms.data.model.TbSnapshotFace;
import com.note.cms.data.model.TbSnapshotFaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSnapshotFaceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    long countByExample(TbSnapshotFaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    int deleteByExample(TbSnapshotFaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    int insert(TbSnapshotFace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    int insertSelective(TbSnapshotFace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    List<TbSnapshotFace> selectByExample(TbSnapshotFaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    TbSnapshotFace selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbSnapshotFace record, @Param("example") TbSnapshotFaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    int updateByExample(@Param("record") TbSnapshotFace record, @Param("example") TbSnapshotFaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    int updateByPrimaryKeySelective(TbSnapshotFace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_snapshot_face
     *
     * @mbg.generated Wed Oct 11 15:05:32 CST 2017
     */
    int updateByPrimaryKey(TbSnapshotFace record);
}