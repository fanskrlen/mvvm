package com.supermarket.pojo;


import java.util.ArrayList;
import java.util.List;

public class TbTypeTemplateExample {
    protected String orderByClause;
    protected boolean distinct;
    //准则集合
    protected List<Criteria> oredCriteria;

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isdistinct() {
        return distinct;
    }

    public void setdistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }


    public void or(Criteria criteria){
        oredCriteria.add(criteria);
    }

    public Criteria ro(){
        Criteria criteria=createCriteriaInternal();  //负责处理该对象
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria(){
        Criteria criteria=createCriteriaInternal();  //负责处理该对象
        if (oredCriteria.size()==0){
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    //负责生产对象
    protected Criteria createCriteriaInternal(){
        Criteria criteria=new Criteria();
        return criteria;
    }

    //清除
    public void clear(){
        oredCriteria.clear();
        orderByClause=null;
        distinct=false;
    }

    //抽象静态类产生criteria
    protected abstract static class GeneratedCriteria{
        protected List<Criterion> criteria;
        protected GeneratedCriteria(){
            super();
            criteria=new ArrayList<Criterion>();
        }

        public boolean isValid(){
            return criteria.size() > 0;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        public List<Criterion> getAllCriteria(){
            return criteria;
        }

        protected void addCriterion(String condition){
            if(condition==null){
                throw new RuntimeException("Value for condition cannot be null");  //条件值不能为空
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition,Object value,String property){
            if (value==null){
                throw new RuntimeException("value for"+property+"cannot be null");
            }
            criteria.add(new Criterion(condition,value));
        }

        protected void addCriterion(String condition,Object value1,Object value2,String  property){
            if(value1==null||value2==null){
                throw new RuntimeException("Between values for"+property+"cannot be null");
            }
            criteria.add(new Criterion(condition,value1,value2));
        }

        //等于空
        public Criteria andIdIsNull(){
            addCriterion("id is null");
            return (Criteria) this;
        }

        //不等于空
        public Criteria andIdIsNotNull(){
            addCriterion("id is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andIdEqualTo(Long value){
            addCriterion("id =",value,"id");
            return (Criteria) this;
        }

        //不等于
        public Criteria andIdNotEqualTo(Long value){
            addCriterion("id <>",value,"id");
            return (Criteria) this;
        }

        //大于
        public Criteria andIdGreaterThan(Long value){
            addCriterion("id >",value,"id");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andIdGreaterThanOrEqualTo(Long value){
            addCriterion("id >=",value,"id");
            return (Criteria) this;
        }

        //小于
        public Criteria andIdLessThan(Long value){
            addCriterion("id <",value,"id");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addIdLessThanOrEqualTo(Long value){
            addCriterion("id <=",value,"id");
            return (Criteria) this;
        }

        //id在里面
        public Criteria andIdIn(List<Long> values){
            addCriterion("id in",values,"id");
            return (Criteria) this;
        }

        //id不在里面
        public Criteria andIdNotIn(List<Long> values){
            addCriterion("id not in",values,"id");
            return (Criteria) this;
        }

        //id等于两个
        public Criteria andIdBetween(Long value1,Long value2){
            addCriterion("id between",value1,value2,"id");
            return (Criteria) this;
        }

        //id不等于两个
        public Criteria andIdNotBetween(Long value1,Long value2){
            addCriterion("id not between",value1,value2,"id");
            return (Criteria) this;
        }

        //------------------------------------------------------------name(模板名称)
        //等于空
        public Criteria andNameIsNull(){
            addCriterion("name is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andNameIsNotNull(){
            addCriterion("name is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andNameEqualTo(String value){
            addCriterion("name =",value,"name");
            return (Criteria) this;
        }

        //不等于
        public Criteria andNameNotEqualTo(String value){
            addCriterion("name <>",value,"name");
            return (Criteria) this;
        }

        //大于
        public Criteria andNameGreaterThan(String value){
            addCriterion("name >",value,"name");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andNameGreaterThanEqualTo(String value){
            addCriterion("name >=",value,"name");
            return (Criteria) this;
        }

        //小于
        public Criteria andNameLessThan(String value){
            addCriterion("name <",value,"name");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addNameLessThanEqualTo(String value){
            addCriterion("name <=",value,"name");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andNameLike(String value){
            addCriterion("name like",value,"name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value){
            addCriterion("name not like",value,"name");
            return (Criteria) this;
        }

        //两个值
        public Criteria andNameBetween(String value1,String value2){
            addCriterion("name between",value1,value2,"name");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andNameNotBetween(String value1,String value2){
            addCriterion("name not between",value1,value2,"name");
            return (Criteria) this;
        }

        //------------------------------------------------------------spec_ids(关联规格)
        //等于空
        public Criteria andSpecIdsIsNull(){
            addCriterion("spec_ids is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andSpecIdsIsNotNull(){
            addCriterion("spec_ids is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andSpecIdsEqualTo(Long value){
            addCriterion("spec_ids =",value,"specIds");
            return (Criteria) this;
        }

        //不等于
        public Criteria andSpecIdsNotEqualTo(Long value){
            addCriterion("spec_ids <>",value,"specIds");
            return (Criteria) this;
        }

        //大于
        public Criteria andSpecIdsGreaterThan(Long value){
            addCriterion("spec_ids >",value,"specIds");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andSpecIdsGreaterThanEqualTo(Long value){
            addCriterion("spec_ids >=",value,"specIds");
            return (Criteria) this;
        }

        //小于
        public Criteria andSpecIdsLessThan(Long value){
            addCriterion("spec_ids <",value,"specIds");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addSpecIdsLessThanEqualTo(Long value){
            addCriterion("spec_ids <=",value,"specIds");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andSpecIdsLike(Long value){
            addCriterion("spec_ids like",value,"specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsNotLike(Long value){
            addCriterion("spec_ids not like",value,"specIds");
            return (Criteria) this;
        }

        //两个值
        public Criteria andSpecIdsBetween(Long value1,Long value2){
            addCriterion("spec_ids between",value1,value2,"specIds");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andSpecIdsNotBetween(Long value1,String value2){
            addCriterion("spec_ids not between",value1,value2,"specIds");
            return (Criteria) this;
        }

        //------------------------------------------------------------brand_ids(排序值)
        //等于空
        public Criteria andBrandIdsIsNull(){
            addCriterion("brand_ids is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andBrandIdsIsNotNull(){
            addCriterion("brand_ids is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andBrandIdsEqualTo(String value){
            addCriterion("brand_ids =",value,"brandIds");
            return (Criteria) this;
        }

        //不等于
        public Criteria andBrandIdsNotEqualTo(String value){
            addCriterion("brand_ids <>",value,"brandIds");
            return (Criteria) this;
        }

        //大于
        public Criteria andBrandIdsGreaterThan(String value){
            addCriterion("brand_ids >",value,"brandIds");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andBrandIdsGreaterThanEqualTo(String value){
            addCriterion("brand_ids >=",value,"brandIds");
            return (Criteria) this;
        }

        //小于
        public Criteria andBrandIdsLessThan(String value){
            addCriterion("brand_ids <",value,"brandIds");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addBrandIdsLessThanEqualTo(String value){
            addCriterion("brand_ids <=",value,"brandIds");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andBrandIdsLike(String value){
            addCriterion("brand_ids like",value,"brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsNotLike(String value){
            addCriterion("brand_ids not like",value,"brandIds");
            return (Criteria) this;
        }

        //两个值
        public Criteria andBrandIdsBetween(String value1,String value2){
            addCriterion("brand_ids between",value1,value2,"brandIds");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andBrandIdsNotBetween(String value1,String value2){
            addCriterion("brand_ids not between",value1,value2,"brandIds");
            return (Criteria) this;
        }

        //------------------------------------------------------------custom_attribute_items(排序值)
        //等于空
        public Criteria andCustomAttributeItemsIsNull(){
            addCriterion("custom_attribute_items is null");   //处理全部sql语句
            return (Criteria) this;
        }

        //不等于空
        public Criteria andCustomAttributeItemsIsNotNull(){
            addCriterion("custom_attribute_items is not null");
            return (Criteria) this;
        }

        //等于
        public Criteria andCustomAttributeItemsEqualTo(String value){
            addCriterion("custom_attribute_items =",value,"customAttributeItems");
            return (Criteria) this;
        }

        //不等于
        public Criteria andCustomAttributeItemsNotEqualTo(String value){
            addCriterion("custom_attribute_items <>",value,"customAttributeItems");
            return (Criteria) this;
        }

        //大于
        public Criteria andCustomAttributeItemsGreaterThan(String value){
            addCriterion("custom_attribute_items >",value,"customAttributeItems");
            return (Criteria) this;
        }

        //大于等于
        public Criteria andCustomAttributeItemsGreaterThanEqualTo(String value){
            addCriterion("custom_attribute_items >=",value,"customAttributeItems");
            return (Criteria) this;
        }

        //小于
        public Criteria andCustomAttributeItemsLessThan(String value){
            addCriterion("custom_attribute_items <",value,"customAttributeItems");
            return (Criteria) this;
        }

        //小于等于
        public Criteria addCustomAttributeItemsLessThanEqualTo(String value){
            addCriterion("custom_attribute_items <=",value,"customAttributeItems");
            return (Criteria) this;
        }

        //模糊查询
        public Criteria andCustomAttributeItemsLike(String value){
            addCriterion("custom_attribute_items like",value,"customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsNotLike(String value){
            addCriterion("custom_attribute_items not like",value,"customAttributeItems");
            return (Criteria) this;
        }

        //两个值
        public Criteria andCustomAttributeItemsBetween(String value1,String value2){
            addCriterion("custom_attribute_items between",value1,value2,"customAttributeItems");
            return (Criteria) this;
        }

        //不是两个值
        public Criteria andCustomAttributeItemsNotBetween(String value1,String value2){
            addCriterion("custom_attribute_items not between",value1,value2,"customAttributeItems");
            return (Criteria) this;
        }

        public void setCriteria(List<Criterion> criteria) {
            this.criteria = criteria;
        }

    }


    public TbTypeTemplateExample() {
        oredCriteria=new ArrayList();
    }

    public static class Criteria extends GeneratedCriteria{    //criteria继承

        protected Criteria(){
            super();
        }

    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public void setSecondValue(Object secondValue) {
            this.secondValue = secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public void setNoValue(boolean noValue) {
            this.noValue = noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public void setSingleValue(boolean singleValue) {
            this.singleValue = singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public void setBetweenValue(boolean betweenValue) {
            this.betweenValue = betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public void setListValue(boolean listValue) {
            this.listValue = listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public void setTypeHandler(String typeHandler) {
            this.typeHandler = typeHandler;
        }

        protected Criterion(String condition){
            super();
            this.condition=condition;
            this.typeHandler=null;
            this.noValue=true;
        }

        protected Criterion(String condition, Object value,String typeHandler){
            super();
            this.condition=condition;
            this.value=value;
            this.typeHandler=typeHandler;
            if(value instanceof List<?>){
                this.listValue=true;        //如果满足条件就是一组数据
            }else {
                this.singleValue=true;      //否则就是一个数据
            }
        }


        protected Criterion(String condition,Object value){
            this(condition,value,null);
        }

        protected Criterion(String condition,Object value,Object secondValue,String typeHandler){
            super();
            this.condition=condition;
            this.value=value;
            this.secondValue=secondValue;
            this.typeHandler=typeHandler;
            this.betweenValue=true;
        }

        protected Criterion(String condition,Object value,Object secondValue){
            this(condition,value,secondValue,null);
        }

    }

}
