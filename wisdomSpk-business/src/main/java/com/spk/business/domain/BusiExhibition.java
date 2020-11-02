package com.spk.business.domain;

import com.spk.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.Date;

public class BusiExhibition extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long exhibitonId;

    /** 展会名称 */
    private String exhibitionName;

    /** 状态（1：保存，2：提交，3：看展，4：布展，5：撤展） */
    private Integer state;

    /** 展会开始时间 */
    private Date startTime;

    /** 展会结束时间 */
    private Date endTime;

    /** 展会办展地址 */
    private String exhibitionVenue;

    /** 办展人 */
    private String organizer;


    public Long getExhibitonId() {
        return exhibitonId;
    }

    public void setExhibitonId(Long exhibitonId) {
        this.exhibitonId = exhibitonId;
    }

    public String getExhibitionName() {
        return exhibitionName;
    }

    public void setExhibitionName(String exhibitionName) {
        this.exhibitionName = exhibitionName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getExhibitionVenue() {
        return exhibitionVenue;
    }

    public void setExhibitionVenue(String exhibitionVenue) {
        this.exhibitionVenue = exhibitionVenue;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("exhibitonId", getExhibitonId())
                .append("exhibitionName", getExhibitionName())
                .append("state", getState())
                .append("startTime", getStartTime())
                .append("endTime", getEndTime())
                .append("exhibitionVenue", getExhibitionVenue())
                .append("organizer", getOrganizer())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("del", getDel())
                .toString();
    }

}
