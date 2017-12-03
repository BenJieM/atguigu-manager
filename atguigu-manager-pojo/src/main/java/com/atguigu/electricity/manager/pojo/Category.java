package com.atguigu.electricity.manager.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "category")
public class Category implements Serializable {
    /**
     * 类目ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品分类名称
     */
    private String name;

    /**
     * 所属父类目，当ID=0时，代表的是一级的类目
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    @Column(name = "show_in_nav")
    private Integer showInNav;

    /**
     * 状态。可选值:1(正常),2(删除)
     */
    @Column(name = "is_show")
    private Integer isShow;

    private Integer grade;

    @Column(name = "filter_attr")
    private String filterAttr;

    @Column(name = "is_top_style")
    private Integer isTopStyle;

    @Column(name = "top_style_tpl")
    private String topStyleTpl;

    @Column(name = "style_icon")
    private String styleIcon;

    @Column(name = "cat_icon")
    private String catIcon;

    @Column(name = "is_top_show")
    private Integer isTopShow;

    @Column(name = "cat_alias_name")
    private String catAliasName;

    @Column(name = "commission_rate")
    private Short commissionRate;

    @Column(name = "touch_icon")
    private String touchIcon;

    @Column(name = "category_links")
    private String categoryLinks;

    @Column(name = "category_topic")
    private String categoryTopic;

    private static final long serialVersionUID = 1L;

    /**
     * 获取类目ID
     *
     * @return id - 类目ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置类目ID
     *
     * @param id 类目ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品分类名称
     *
     * @return name - 商品分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品分类名称
     *
     * @param name 商品分类名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取所属父类目，当ID=0时，代表的是一级的类目
     *
     * @return parent_id - 所属父类目，当ID=0时，代表的是一级的类目
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置所属父类目，当ID=0时，代表的是一级的类目
     *
     * @param parentId 所属父类目，当ID=0时，代表的是一级的类目
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     *
     * @return sort_order - 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     *
     * @param sortOrder 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * @return show_in_nav
     */
    public Integer getShowInNav() {
        return showInNav;
    }

    /**
     * @param showInNav
     */
    public void setShowInNav(Integer showInNav) {
        this.showInNav = showInNav;
    }

    /**
     * 获取状态。可选值:1(正常),2(删除)
     *
     * @return is_show - 状态。可选值:1(正常),2(删除)
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 设置状态。可选值:1(正常),2(删除)
     *
     * @param isShow 状态。可选值:1(正常),2(删除)
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * @return grade
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * @param grade
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * @return filter_attr
     */
    public String getFilterAttr() {
        return filterAttr;
    }

    /**
     * @param filterAttr
     */
    public void setFilterAttr(String filterAttr) {
        this.filterAttr = filterAttr == null ? null : filterAttr.trim();
    }

    /**
     * @return is_top_style
     */
    public Integer getIsTopStyle() {
        return isTopStyle;
    }

    /**
     * @param isTopStyle
     */
    public void setIsTopStyle(Integer isTopStyle) {
        this.isTopStyle = isTopStyle;
    }

    /**
     * @return top_style_tpl
     */
    public String getTopStyleTpl() {
        return topStyleTpl;
    }

    /**
     * @param topStyleTpl
     */
    public void setTopStyleTpl(String topStyleTpl) {
        this.topStyleTpl = topStyleTpl == null ? null : topStyleTpl.trim();
    }

    /**
     * @return style_icon
     */
    public String getStyleIcon() {
        return styleIcon;
    }

    /**
     * @param styleIcon
     */
    public void setStyleIcon(String styleIcon) {
        this.styleIcon = styleIcon == null ? null : styleIcon.trim();
    }

    /**
     * @return cat_icon
     */
    public String getCatIcon() {
        return catIcon;
    }

    /**
     * @param catIcon
     */
    public void setCatIcon(String catIcon) {
        this.catIcon = catIcon == null ? null : catIcon.trim();
    }

    /**
     * @return is_top_show
     */
    public Integer getIsTopShow() {
        return isTopShow;
    }

    /**
     * @param isTopShow
     */
    public void setIsTopShow(Integer isTopShow) {
        this.isTopShow = isTopShow;
    }

    /**
     * @return cat_alias_name
     */
    public String getCatAliasName() {
        return catAliasName;
    }

    /**
     * @param catAliasName
     */
    public void setCatAliasName(String catAliasName) {
        this.catAliasName = catAliasName == null ? null : catAliasName.trim();
    }

    /**
     * @return commission_rate
     */
    public Short getCommissionRate() {
        return commissionRate;
    }

    /**
     * @param commissionRate
     */
    public void setCommissionRate(Short commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * @return touch_icon
     */
    public String getTouchIcon() {
        return touchIcon;
    }

    /**
     * @param touchIcon
     */
    public void setTouchIcon(String touchIcon) {
        this.touchIcon = touchIcon == null ? null : touchIcon.trim();
    }

    /**
     * @return category_links
     */
    public String getCategoryLinks() {
        return categoryLinks;
    }

    /**
     * @param categoryLinks
     */
    public void setCategoryLinks(String categoryLinks) {
        this.categoryLinks = categoryLinks == null ? null : categoryLinks.trim();
    }

    /**
     * @return category_topic
     */
    public String getCategoryTopic() {
        return categoryTopic;
    }

    /**
     * @param categoryTopic
     */
    public void setCategoryTopic(String categoryTopic) {
        this.categoryTopic = categoryTopic == null ? null : categoryTopic.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", showInNav=").append(showInNav);
        sb.append(", isShow=").append(isShow);
        sb.append(", grade=").append(grade);
        sb.append(", filterAttr=").append(filterAttr);
        sb.append(", isTopStyle=").append(isTopStyle);
        sb.append(", topStyleTpl=").append(topStyleTpl);
        sb.append(", styleIcon=").append(styleIcon);
        sb.append(", catIcon=").append(catIcon);
        sb.append(", isTopShow=").append(isTopShow);
        sb.append(", catAliasName=").append(catAliasName);
        sb.append(", commissionRate=").append(commissionRate);
        sb.append(", touchIcon=").append(touchIcon);
        sb.append(", categoryLinks=").append(categoryLinks);
        sb.append(", categoryTopic=").append(categoryTopic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Category other = (Category) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getSortOrder() == null ? other.getSortOrder() == null : this.getSortOrder().equals(other.getSortOrder()))
            && (this.getShowInNav() == null ? other.getShowInNav() == null : this.getShowInNav().equals(other.getShowInNav()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getFilterAttr() == null ? other.getFilterAttr() == null : this.getFilterAttr().equals(other.getFilterAttr()))
            && (this.getIsTopStyle() == null ? other.getIsTopStyle() == null : this.getIsTopStyle().equals(other.getIsTopStyle()))
            && (this.getTopStyleTpl() == null ? other.getTopStyleTpl() == null : this.getTopStyleTpl().equals(other.getTopStyleTpl()))
            && (this.getStyleIcon() == null ? other.getStyleIcon() == null : this.getStyleIcon().equals(other.getStyleIcon()))
            && (this.getCatIcon() == null ? other.getCatIcon() == null : this.getCatIcon().equals(other.getCatIcon()))
            && (this.getIsTopShow() == null ? other.getIsTopShow() == null : this.getIsTopShow().equals(other.getIsTopShow()))
            && (this.getCatAliasName() == null ? other.getCatAliasName() == null : this.getCatAliasName().equals(other.getCatAliasName()))
            && (this.getCommissionRate() == null ? other.getCommissionRate() == null : this.getCommissionRate().equals(other.getCommissionRate()))
            && (this.getTouchIcon() == null ? other.getTouchIcon() == null : this.getTouchIcon().equals(other.getTouchIcon()))
            && (this.getCategoryLinks() == null ? other.getCategoryLinks() == null : this.getCategoryLinks().equals(other.getCategoryLinks()))
            && (this.getCategoryTopic() == null ? other.getCategoryTopic() == null : this.getCategoryTopic().equals(other.getCategoryTopic()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        result = prime * result + ((getShowInNav() == null) ? 0 : getShowInNav().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getFilterAttr() == null) ? 0 : getFilterAttr().hashCode());
        result = prime * result + ((getIsTopStyle() == null) ? 0 : getIsTopStyle().hashCode());
        result = prime * result + ((getTopStyleTpl() == null) ? 0 : getTopStyleTpl().hashCode());
        result = prime * result + ((getStyleIcon() == null) ? 0 : getStyleIcon().hashCode());
        result = prime * result + ((getCatIcon() == null) ? 0 : getCatIcon().hashCode());
        result = prime * result + ((getIsTopShow() == null) ? 0 : getIsTopShow().hashCode());
        result = prime * result + ((getCatAliasName() == null) ? 0 : getCatAliasName().hashCode());
        result = prime * result + ((getCommissionRate() == null) ? 0 : getCommissionRate().hashCode());
        result = prime * result + ((getTouchIcon() == null) ? 0 : getTouchIcon().hashCode());
        result = prime * result + ((getCategoryLinks() == null) ? 0 : getCategoryLinks().hashCode());
        result = prime * result + ((getCategoryTopic() == null) ? 0 : getCategoryTopic().hashCode());
        return result;
    }
}