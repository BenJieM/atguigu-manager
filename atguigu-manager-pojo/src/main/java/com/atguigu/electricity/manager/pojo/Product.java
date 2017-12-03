package com.atguigu.electricity.manager.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;

@Table(name = "product")
public class Product implements Serializable {
	/**
	 * 商品id，同时也是商品编号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 商品标题
	 */
	private String title;

	/**
	 * 商品卖点
	 */
	private String sellpoint;

	/**
	 * 商品价格，单位为：分
	 */
	private Long price;

	/**
	 * 库存数量
	 */
	private Integer num;

	/**
	 * 商品图片
	 */
	private String image;

	/**
	 * 所属类目，叶子类目
	 */
	private Long cid;

	/**
	 * 商品状态，1-正常，2-下架，3-删除
	 */
	private Byte status = 1;

	private static final long serialVersionUID = 1L;

	// 在映射数据库表的时候，忽略该属性
	@Transient
	private String[] images;

	public String[] getImages() {
		if (StringUtils.isNotBlank(this.image)) {
			return StringUtils.split(this.image, ",");
		}
		return null;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	/**
	 * 获取商品id，同时也是商品编号
	 *
	 * @return id - 商品id，同时也是商品编号
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置商品id，同时也是商品编号
	 *
	 * @param id
	 *            商品id，同时也是商品编号
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取商品标题
	 *
	 * @return title - 商品标题
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 设置商品标题
	 *
	 * @param title
	 *            商品标题
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * 获取商品卖点
	 *
	 * @return sellpoint - 商品卖点
	 */
	public String getSellpoint() {
		return sellpoint;
	}

	/**
	 * 设置商品卖点
	 *
	 * @param sellpoint
	 *            商品卖点
	 */
	public void setSellpoint(String sellpoint) {
		this.sellpoint = sellpoint == null ? null : sellpoint.trim();
	}

	/**
	 * 获取商品价格，单位为：分
	 *
	 * @return price - 商品价格，单位为：分
	 */
	public Long getPrice() {
		return price;
	}

	/**
	 * 设置商品价格，单位为：分
	 *
	 * @param price
	 *            商品价格，单位为：分
	 */
	public void setPrice(Long price) {
		this.price = price;
	}

	/**
	 * 获取库存数量
	 *
	 * @return num - 库存数量
	 */
	public Integer getNum() {
		return num;
	}

	/**
	 * 设置库存数量
	 *
	 * @param num
	 *            库存数量
	 */
	public void setNum(Integer num) {
		this.num = num;
	}

	/**
	 * 获取商品图片
	 *
	 * @return image - 商品图片
	 */
	public String getImage() {
		return image;
	}

	/**
	 * 设置商品图片
	 *
	 * @param image
	 *            商品图片
	 */
	public void setImage(String image) {
		this.image = image == null ? null : image.trim();
	}

	/**
	 * 获取所属类目，叶子类目
	 *
	 * @return cid - 所属类目，叶子类目
	 */
	public Long getCid() {
		return cid;
	}

	/**
	 * 设置所属类目，叶子类目
	 *
	 * @param cid
	 *            所属类目，叶子类目
	 */
	public void setCid(Long cid) {
		this.cid = cid;
	}

	/**
	 * 获取商品状态，1-正常，2-下架，3-删除
	 *
	 * @return status - 商品状态，1-正常，2-下架，3-删除
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * 设置商品状态，1-正常，2-下架，3-删除
	 *
	 * @param status
	 *            商品状态，1-正常，2-下架，3-删除
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", title=").append(title);
		sb.append(", sellpoint=").append(sellpoint);
		sb.append(", price=").append(price);
		sb.append(", num=").append(num);
		sb.append(", image=").append(image);
		sb.append(", cid=").append(cid);
		sb.append(", status=").append(status);
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
		Product other = (Product) that;
		return (this.getId() == null ? other.getId() == null : this.getId()
				.equals(other.getId()))
				&& (this.getTitle() == null ? other.getTitle() == null : this
						.getTitle().equals(other.getTitle()))
				&& (this.getSellpoint() == null ? other.getSellpoint() == null
						: this.getSellpoint().equals(other.getSellpoint()))
				&& (this.getPrice() == null ? other.getPrice() == null : this
						.getPrice().equals(other.getPrice()))
				&& (this.getNum() == null ? other.getNum() == null : this
						.getNum().equals(other.getNum()))
				&& (this.getImage() == null ? other.getImage() == null : this
						.getImage().equals(other.getImage()))
				&& (this.getCid() == null ? other.getCid() == null : this
						.getCid().equals(other.getCid()))
				&& (this.getStatus() == null ? other.getStatus() == null : this
						.getStatus().equals(other.getStatus()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result
				+ ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result
				+ ((getSellpoint() == null) ? 0 : getSellpoint().hashCode());
		result = prime * result
				+ ((getPrice() == null) ? 0 : getPrice().hashCode());
		result = prime * result
				+ ((getNum() == null) ? 0 : getNum().hashCode());
		result = prime * result
				+ ((getImage() == null) ? 0 : getImage().hashCode());
		result = prime * result
				+ ((getCid() == null) ? 0 : getCid().hashCode());
		result = prime * result
				+ ((getStatus() == null) ? 0 : getStatus().hashCode());
		return result;
	}
}