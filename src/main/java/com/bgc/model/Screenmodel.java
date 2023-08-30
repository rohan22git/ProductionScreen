package com.bgc.model;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dbo_product_classification_lookup ")
public class Screenmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="dt_create_datetime")
	private String dtcreatedatetime;
	
	@Column(name="id_user_create")	
	private String idusercreate;
	
	@Column(name="dt_modified_datetime")	
	private String dtmodifieddatetime;
	
	@Column(name="id_user_last_modified")	
	private String iduserlastmodified;
	
	@Column(name="record_version")
	private int recordversion;
	
	@Column(name="BusinessStrategy")	
	private String BusinessStrategy;
	
	@Column(name="TransactionType")	
	private String TransactionType;
	
	@Column(name="ProductType")	
	private String ProductType;
	
	@Column(name="ProductSubType")	
	private String ProductSubType;
	
	@Column(name="AmountType")
	private String AmountType;
	
	@Column(name="TargetSystem")
	private String TargetSystem;
	
	@Column(name="TargetTradeType")
	private String TargetTradeType;
	
	@Column(name="TargetTradeSubType")
	private String TargetTradeSubType;
	
	@Column(name=" createDate")
	private String createDate;
	
	@Column(name=" modifiedDate")
	private String modifiedDate;
	
	@Column(name=" modifiedBy")
	private String modifiedBy;
	
	@Column(name=" isActive")
	private int isActive;
	
	@Column(name=" SettlementType")
	private String SettlementType;
	
	@Column(name=" DealType")
	private String DealType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDtcreatedatetime() {
		return dtcreatedatetime;
	}
	public void setDtcreatedatetime(String dtcreatedatetime) {
		this.dtcreatedatetime = dtcreatedatetime;
	}
	public String getIdusercreate() {
		return idusercreate;
	}
	public void setIdusercreate(String idusercreate) {
		this.idusercreate = idusercreate;
	}
	public String getDtmodifieddatetime() {
		return dtmodifieddatetime;
	}
	public void setDtmodifieddatetime(String dtmodifieddatetime) {
		this.dtmodifieddatetime = dtmodifieddatetime;
	}
	public String getIduserlastmodified() {
		return iduserlastmodified;
	}
	public void setIduserlastmodified(String iduserlastmodified) {
		this.iduserlastmodified = iduserlastmodified;
	}
	public int getRecordversion() {
		return recordversion;
	}
	public void setRecordversion(int recordversion) {
		this.recordversion = recordversion;
	}
	public String getBusinessStrategy() {
		return BusinessStrategy;
	}
	public void setBusinessStrategy(String businessStrategy) {
		BusinessStrategy = businessStrategy;
	}
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String productType) {
		ProductType = productType;
	}
	public String getProductSubType() {
		return ProductSubType;
	}
	public void setProductSubType(String productSubType) {
		ProductSubType = productSubType;
	}
	public String getAmountType() {
		return AmountType;
	}
	public void setAmountType(String amountType) {
		AmountType = amountType;
	}
	public String getTargetSystem() {
		return TargetSystem;
	}
	public void setTargetSystem(String targetSystem) {
		TargetSystem = targetSystem;
	}
	public String getTargetTradeType() {
		return TargetTradeType;
	}
	public void setTargetTradeType(String targetTradeType) {
		TargetTradeType = targetTradeType;
	}
	public String getTargetTradeSubType() {
		return TargetTradeSubType;
	}
	public void setTargetTradeSubType(String targetTradeSubType) {
		TargetTradeSubType = targetTradeSubType;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public String getSettlementType() {
		return SettlementType;
	}
	public void setSettlementType(String settlementType) {
		SettlementType = settlementType;
	}
	public String getDealType() {
		return DealType;
	}
	public void setDealType(String dealType) {
		DealType = dealType;
	}
	public Screenmodel(int id, String dtcreatedatetime, String idusercreate, String dtmodifieddatetime,
			String iduserlastmodified, int recordversion, String businessStrategy, String transactionType,
			String productType, String productSubType, String amountType, String targetSystem, String targetTradeType,
			String targetTradeSubType, String createDate, String modifiedDate, String modifiedBy, int isActive,
			String settlementType, String dealType) {
		super();
		this.id = id;
		this.dtcreatedatetime = dtcreatedatetime;
		this.idusercreate = idusercreate;
		this.dtmodifieddatetime = dtmodifieddatetime;
		this.iduserlastmodified = iduserlastmodified;
		this.recordversion = recordversion;
		BusinessStrategy = businessStrategy;
		TransactionType = transactionType;
		ProductType = productType;
		ProductSubType = productSubType;
		AmountType = amountType;
		TargetSystem = targetSystem;
		TargetTradeType = targetTradeType;
		TargetTradeSubType = targetTradeSubType;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
		this.isActive = isActive;
		SettlementType = settlementType;
		DealType = dealType;
	}
	public Screenmodel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
