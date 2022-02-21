package com.bms.goods.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class GoodsDto {
	
	private int    goodsId;
	private String goodsTitle;
	private String goodsWriter;
	private int    goodsPrice;
	private String goodsPublisher;
	private String goodsSort;
	private int    goodsSalesPrice;
	private int    goodsPoint;
	private Date   goodsPublishedDate;
	private int    goodsTotalPage;
	private String goodsIsbn;
	private int    goodsDeliveryPrice;
	private Date   goodsDeliveryDate;
	private String goodsStatus;
	private String goodsWriterIntro;
	private String goodsContentsOrder;
	private String goodsIntro;
	private String goodsPublisherComment;
	private String goodsRecommendation;
	private String goodsFileName;
	private Date   goodsCredate;
	
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsTitle() {
		return goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}
	public String getGoodsWriter() {
		return goodsWriter;
	}
	public void setGoodsWriter(String goodsWriter) {
		this.goodsWriter = goodsWriter;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsPublisher() {
		return goodsPublisher;
	}
	public void setGoodsPublisher(String goodsPublisher) {
		this.goodsPublisher = goodsPublisher;
	}
	public String getGoodsSort() {
		return goodsSort;
	}
	public void setGoodsSort(String goodsSort) {
		this.goodsSort = goodsSort;
	}
	public int getGoodsSalesPrice() {
		return goodsSalesPrice;
	}
	public void setGoodsSalesPrice(int goodsSalesPrice) {
		this.goodsSalesPrice = goodsSalesPrice;
	}
	public int getGoodsPoint() {
		return goodsPoint;
	}
	public void setGoodsPoint(int goodsPoint) {
		this.goodsPoint = goodsPoint;
	}
	public Date getGoodsPublishedDate() {
		return goodsPublishedDate;
	}
	public void setGoodsPublishedDate(Date goodsPublishedDate) {
		this.goodsPublishedDate = goodsPublishedDate;
	}
	public int getGoodsTotalPage() {
		return goodsTotalPage;
	}
	public void setGoodsTotalPage(int goodsTotalPage) {
		this.goodsTotalPage = goodsTotalPage;
	}
	public String getGoodsIsbn() {
		return goodsIsbn;
	}
	public void setGoodsIsbn(String goodsIsbn) {
		this.goodsIsbn = goodsIsbn;
	}
	public int getGoodsDeliveryPrice() {
		return goodsDeliveryPrice;
	}
	public void setGoodsDeliveryPrice(int goodsDeliveryPrice) {
		this.goodsDeliveryPrice = goodsDeliveryPrice;
	}
	public Date getGoodsDeliveryDate() {
		return goodsDeliveryDate;
	}
	public void setGoodsDeliveryDate(Date goodsDeliveryDate) {
		this.goodsDeliveryDate = goodsDeliveryDate;
	}
	public String getGoodsStatus() {
		return goodsStatus;
	}
	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}
	public String getGoodsWriterIntro() {
		return goodsWriterIntro;
	}
	public void setGoodsWriterIntro(String goodsWriterIntro) {
		this.goodsWriterIntro = goodsWriterIntro;
	}
	public String getGoodsContentsOrder() {
		return goodsContentsOrder;
	}
	public void setGoodsContentsOrder(String goodsContentsOrder) {
		this.goodsContentsOrder = goodsContentsOrder;
	}
	public String getGoodsIntro() {
		return goodsIntro;
	}
	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}
	public String getGoodsPublisherComment() {
		return goodsPublisherComment;
	}
	public void setGoodsPublisherComment(String goodsPublisherComment) {
		this.goodsPublisherComment = goodsPublisherComment;
	}
	public String getGoodsRecommendation() {
		return goodsRecommendation;
	}
	public void setGoodsRecommendation(String goodsRecommendation) {
		this.goodsRecommendation = goodsRecommendation;
	}
	public String getGoodsFileName() {
		return goodsFileName;
	}
	public void setGoodsFileName(String goodsFileName) {
		this.goodsFileName = goodsFileName;
	}
	public Date getGoodsCredate() {
		return goodsCredate;
	}
	public void setGoodsCredate(Date goodsCredate) {
		this.goodsCredate = goodsCredate;
	}
	
	@Override
	public String toString() {
		return "GoodsDto [goodsId=" + goodsId + ", goodsTitle=" + goodsTitle + ", goodsWriter=" + goodsWriter
				+ ", goodsPrice=" + goodsPrice + ", goodsPublisher=" + goodsPublisher + ", goodsSort=" + goodsSort
				+ ", goodsSalesPrice=" + goodsSalesPrice + ", goodsPoint=" + goodsPoint + ", goodsPublishedDate="
				+ goodsPublishedDate + ", goodsTotalPage=" + goodsTotalPage + ", goodsIsbn=" + goodsIsbn
				+ ", goodsDeliveryPrice=" + goodsDeliveryPrice + ", goodsDeliveryDate=" + goodsDeliveryDate
				+ ", goodsStatus=" + goodsStatus + ", goodsWriterIntro=" + goodsWriterIntro + ", goodsContentsOrder="
				+ goodsContentsOrder + ", goodsIntro=" + goodsIntro + ", goodsPublisherComment=" + goodsPublisherComment
				+ ", goodsRecommendation=" + goodsRecommendation + ", goodsFileName=" + goodsFileName
				+ ", goodsCredate=" + goodsCredate + "]";
	}
	
}
