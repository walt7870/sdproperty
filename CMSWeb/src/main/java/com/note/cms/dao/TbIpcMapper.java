package com.note.cms.dao;

import com.note.cms.data.model.TbIpc;
import com.note.cms.data.model.TbIpcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbIpcMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    long countByExample(TbIpcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    int deleteByExample(TbIpcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    int insert(TbIpc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    int insertSelective(TbIpc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    List<TbIpc> selectByExample(TbIpcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    TbIpc selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbIpc record, @Param("example") TbIpcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    int updateByExample(@Param("record") TbIpc record, @Param("example") TbIpcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    int updateByPrimaryKeySelective(TbIpc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ipc
     *
     * @mbg.generated Sat Jul 15 16:01:11 CST 2017
     */
    int updateByPrimaryKey(TbIpc record);
}