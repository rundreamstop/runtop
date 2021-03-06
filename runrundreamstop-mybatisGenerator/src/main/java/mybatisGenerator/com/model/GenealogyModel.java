package mybatisGenerator.com.model;

import java.util.Date;

public class GenealogyModel {
    /**
     * 编号
     *
     * @mbggenerated
     */
    private Long gid;

    /**
     * 谱书代码，唯一，不能重复
     *
     * @mbggenerated
     */
    private String pid;

    /**
     * 谱书名称
     *
     * @mbggenerated
     */
    private String familyname;

    /**
     * 姓氏首字母：如A
     *
     * @mbggenerated
     */
    private String nameletter;

    /**
     * 姓氏编号
     *
     * @mbggenerated
     */
    private Long noid;

    /**
     * 姓氏名称
     *
     * @mbggenerated
     */
    private String noname;

    /**
     * 始祖，也就是人物表根节点
     *
     * @mbggenerated
     */
    private String ancestor;

    /**
     * 起始世代数，对应人物表中ggen值
     *
     * @mbggenerated
     */
    private Integer generation;

    /**
     * 谱书封面编号
     *
     * @mbggenerated
     */
    private Integer coverid;

    /**
     * 谱书封面
     *
     * @mbggenerated
     */
    private String cover;

    /**
     * 起始支系名，会在谱书目录世系中添加一条支系记录
     *
     * @mbggenerated
     */
    private String startbranch;

    /**
     * 公开程度：0完全私密；1有限公开；2完全公开
     *
     * @mbggenerated
     */
    private Byte open;

    /**
     * 查看密码
     *
     * @mbggenerated
     */
    private String gpassword;

    /**
     * 支付密码
     *
     * @mbggenerated
     */
    private String paypassword;

    /**
     * 堂号
     *
     * @mbggenerated
     */
    private String tangname;

    /**
     * 主责任人
     *
     * @mbggenerated
     */
    private String mainresponsible;

    /**
     * 其他责任人
     *
     * @mbggenerated
     */
    private String otherresponsible;

    /**
     * 联系方式
     *
     * @mbggenerated
     */
    private String contact;

    /**
     * 联系人
     *
     * @mbggenerated
     */
    private String contactperson;

    /**
     * 谱书来源
     *
     * @mbggenerated
     */
    private String source;

    /**
     * 谱书描述
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 谱书版本号
     *
     * @mbggenerated
     */
    private String gversion;

    /**
     * 谱书状态
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 谱书所在省
     *
     * @mbggenerated
     */
    private String locationplace;

    /**
     * 创建者编号
     *
     * @mbggenerated
     */
    private Long uid;

    /**
     * 创建者姓名
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * 双世系前缀
     *
     * @mbggenerated
     */
    private String doublegenprefix;

    /**
     * 双世系起始世代
     *
     * @mbggenerated
     */
    private String doublegen;

    /**
     * 创建日期
     *
     * @mbggenerated
     */
    private Date createdate;

    /**
     * 修改日期
     *
     * @mbggenerated
     */
    private Date modifydate;

    /**
     * 归档日期
     *
     * @mbggenerated
     */
    private Date archivedate;

    /**
     * 归档说明
     *
     * @mbggenerated
     */
    private String archivedsc;

    /**
     * 族谱图片容量，单位为字节，默认为50M
     *
     * @mbggenerated
     */
    private Integer capacity;

    /**
     * IP地址
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * 删除标记：0正常；1删除
     *
     * @mbggenerated
     */
    private Boolean delstate;

    /**
     * 审核标记：0待审核；1审核不通过；2审核通过
     *
     * @mbggenerated
     */
    private Integer approval;

    /**
     * 版本 1:简化版 2:专业版
     *
     * @mbggenerated
     */
    private Byte styleedition;

    /**
     * 合作商ID
     *
     * @mbggenerated
     */
    private String partnerid;

    /**
     * 电子谱地址
     *
     * @mbggenerated
     */
    private String ebook;

    /**
     * 谱书所在市
     *
     * @mbggenerated
     */
    private String city;

    /**
     * 谱书所在市
     *
     * @mbggenerated
     */
    private String citytown;

    /**
     * 是否为总谱
     *
     * @mbggenerated
     */
    private Byte primegenealogy;

    /**
     * 判断是否是第一点击谱文编辑  0是、1否  默认为0
     *
     * @mbggenerated
     */
    private Boolean isfirst;

    /**
     * 是否置顶，0否，1是
     *
     * @mbggenerated
     */
    private Boolean top;

    /**
     * 字辈描述
     *
     * @mbggenerated
     */
    private String inferioritydsc;

    /**
     * 谱书类型 0:PC 1:小家谱 2:图片谱
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 谱书打包价格
     *
     * @mbggenerated
     */
    private Integer price;

    /**
     * 谱书付费状态：1打包收费，0部分收费
     *
     * @mbggenerated
     */
    private Boolean paystatus;

    /**
     * 谱书价格提成，默认20%是给平台的
     *
     * @mbggenerated
     */
    private Integer discount;

    /**
     * 上传水印的地址
     *
     * @mbggenerated
     */
    private String watermarkurl;

    /**
     * 显示水印的类型：1:显示,2:不显示
     *
     * @mbggenerated
     */
    private Integer watermarktype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.gid
     *
     * @return the value of t_genealogy.gid
     *
     * @mbggenerated
     */
    public Long getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.gid
     *
     * @param gid the value for t_genealogy.gid
     *
     * @mbggenerated
     */
    public void setGid(Long gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.pid
     *
     * @return the value of t_genealogy.pid
     *
     * @mbggenerated
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.pid
     *
     * @param pid the value for t_genealogy.pid
     *
     * @mbggenerated
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.familyname
     *
     * @return the value of t_genealogy.familyname
     *
     * @mbggenerated
     */
    public String getFamilyname() {
        return familyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.familyname
     *
     * @param familyname the value for t_genealogy.familyname
     *
     * @mbggenerated
     */
    public void setFamilyname(String familyname) {
        this.familyname = familyname == null ? null : familyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.nameletter
     *
     * @return the value of t_genealogy.nameletter
     *
     * @mbggenerated
     */
    public String getNameletter() {
        return nameletter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.nameletter
     *
     * @param nameletter the value for t_genealogy.nameletter
     *
     * @mbggenerated
     */
    public void setNameletter(String nameletter) {
        this.nameletter = nameletter == null ? null : nameletter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.noid
     *
     * @return the value of t_genealogy.noid
     *
     * @mbggenerated
     */
    public Long getNoid() {
        return noid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.noid
     *
     * @param noid the value for t_genealogy.noid
     *
     * @mbggenerated
     */
    public void setNoid(Long noid) {
        this.noid = noid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.noname
     *
     * @return the value of t_genealogy.noname
     *
     * @mbggenerated
     */
    public String getNoname() {
        return noname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.noname
     *
     * @param noname the value for t_genealogy.noname
     *
     * @mbggenerated
     */
    public void setNoname(String noname) {
        this.noname = noname == null ? null : noname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.ancestor
     *
     * @return the value of t_genealogy.ancestor
     *
     * @mbggenerated
     */
    public String getAncestor() {
        return ancestor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.ancestor
     *
     * @param ancestor the value for t_genealogy.ancestor
     *
     * @mbggenerated
     */
    public void setAncestor(String ancestor) {
        this.ancestor = ancestor == null ? null : ancestor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.generation
     *
     * @return the value of t_genealogy.generation
     *
     * @mbggenerated
     */
    public Integer getGeneration() {
        return generation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.generation
     *
     * @param generation the value for t_genealogy.generation
     *
     * @mbggenerated
     */
    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.coverId
     *
     * @return the value of t_genealogy.coverId
     *
     * @mbggenerated
     */
    public Integer getCoverid() {
        return coverid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.coverId
     *
     * @param coverid the value for t_genealogy.coverId
     *
     * @mbggenerated
     */
    public void setCoverid(Integer coverid) {
        this.coverid = coverid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.cover
     *
     * @return the value of t_genealogy.cover
     *
     * @mbggenerated
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.cover
     *
     * @param cover the value for t_genealogy.cover
     *
     * @mbggenerated
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.startbranch
     *
     * @return the value of t_genealogy.startbranch
     *
     * @mbggenerated
     */
    public String getStartbranch() {
        return startbranch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.startbranch
     *
     * @param startbranch the value for t_genealogy.startbranch
     *
     * @mbggenerated
     */
    public void setStartbranch(String startbranch) {
        this.startbranch = startbranch == null ? null : startbranch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.open
     *
     * @return the value of t_genealogy.open
     *
     * @mbggenerated
     */
    public Byte getOpen() {
        return open;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.open
     *
     * @param open the value for t_genealogy.open
     *
     * @mbggenerated
     */
    public void setOpen(Byte open) {
        this.open = open;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.gpassword
     *
     * @return the value of t_genealogy.gpassword
     *
     * @mbggenerated
     */
    public String getGpassword() {
        return gpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.gpassword
     *
     * @param gpassword the value for t_genealogy.gpassword
     *
     * @mbggenerated
     */
    public void setGpassword(String gpassword) {
        this.gpassword = gpassword == null ? null : gpassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.paypassword
     *
     * @return the value of t_genealogy.paypassword
     *
     * @mbggenerated
     */
    public String getPaypassword() {
        return paypassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.paypassword
     *
     * @param paypassword the value for t_genealogy.paypassword
     *
     * @mbggenerated
     */
    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.tangname
     *
     * @return the value of t_genealogy.tangname
     *
     * @mbggenerated
     */
    public String getTangname() {
        return tangname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.tangname
     *
     * @param tangname the value for t_genealogy.tangname
     *
     * @mbggenerated
     */
    public void setTangname(String tangname) {
        this.tangname = tangname == null ? null : tangname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.mainresponsible
     *
     * @return the value of t_genealogy.mainresponsible
     *
     * @mbggenerated
     */
    public String getMainresponsible() {
        return mainresponsible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.mainresponsible
     *
     * @param mainresponsible the value for t_genealogy.mainresponsible
     *
     * @mbggenerated
     */
    public void setMainresponsible(String mainresponsible) {
        this.mainresponsible = mainresponsible == null ? null : mainresponsible.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.otherresponsible
     *
     * @return the value of t_genealogy.otherresponsible
     *
     * @mbggenerated
     */
    public String getOtherresponsible() {
        return otherresponsible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.otherresponsible
     *
     * @param otherresponsible the value for t_genealogy.otherresponsible
     *
     * @mbggenerated
     */
    public void setOtherresponsible(String otherresponsible) {
        this.otherresponsible = otherresponsible == null ? null : otherresponsible.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.contact
     *
     * @return the value of t_genealogy.contact
     *
     * @mbggenerated
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.contact
     *
     * @param contact the value for t_genealogy.contact
     *
     * @mbggenerated
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.contactperson
     *
     * @return the value of t_genealogy.contactperson
     *
     * @mbggenerated
     */
    public String getContactperson() {
        return contactperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.contactperson
     *
     * @param contactperson the value for t_genealogy.contactperson
     *
     * @mbggenerated
     */
    public void setContactperson(String contactperson) {
        this.contactperson = contactperson == null ? null : contactperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.source
     *
     * @return the value of t_genealogy.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.source
     *
     * @param source the value for t_genealogy.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.description
     *
     * @return the value of t_genealogy.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.description
     *
     * @param description the value for t_genealogy.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.gversion
     *
     * @return the value of t_genealogy.gversion
     *
     * @mbggenerated
     */
    public String getGversion() {
        return gversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.gversion
     *
     * @param gversion the value for t_genealogy.gversion
     *
     * @mbggenerated
     */
    public void setGversion(String gversion) {
        this.gversion = gversion == null ? null : gversion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.status
     *
     * @return the value of t_genealogy.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.status
     *
     * @param status the value for t_genealogy.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.locationplace
     *
     * @return the value of t_genealogy.locationplace
     *
     * @mbggenerated
     */
    public String getLocationplace() {
        return locationplace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.locationplace
     *
     * @param locationplace the value for t_genealogy.locationplace
     *
     * @mbggenerated
     */
    public void setLocationplace(String locationplace) {
        this.locationplace = locationplace == null ? null : locationplace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.uid
     *
     * @return the value of t_genealogy.uid
     *
     * @mbggenerated
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.uid
     *
     * @param uid the value for t_genealogy.uid
     *
     * @mbggenerated
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.creator
     *
     * @return the value of t_genealogy.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.creator
     *
     * @param creator the value for t_genealogy.creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.sort
     *
     * @return the value of t_genealogy.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.sort
     *
     * @param sort the value for t_genealogy.sort
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.doublegenprefix
     *
     * @return the value of t_genealogy.doublegenprefix
     *
     * @mbggenerated
     */
    public String getDoublegenprefix() {
        return doublegenprefix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.doublegenprefix
     *
     * @param doublegenprefix the value for t_genealogy.doublegenprefix
     *
     * @mbggenerated
     */
    public void setDoublegenprefix(String doublegenprefix) {
        this.doublegenprefix = doublegenprefix == null ? null : doublegenprefix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.doublegen
     *
     * @return the value of t_genealogy.doublegen
     *
     * @mbggenerated
     */
    public String getDoublegen() {
        return doublegen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.doublegen
     *
     * @param doublegen the value for t_genealogy.doublegen
     *
     * @mbggenerated
     */
    public void setDoublegen(String doublegen) {
        this.doublegen = doublegen == null ? null : doublegen.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.createdate
     *
     * @return the value of t_genealogy.createdate
     *
     * @mbggenerated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.createdate
     *
     * @param createdate the value for t_genealogy.createdate
     *
     * @mbggenerated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.modifydate
     *
     * @return the value of t_genealogy.modifydate
     *
     * @mbggenerated
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.modifydate
     *
     * @param modifydate the value for t_genealogy.modifydate
     *
     * @mbggenerated
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.archivedate
     *
     * @return the value of t_genealogy.archivedate
     *
     * @mbggenerated
     */
    public Date getArchivedate() {
        return archivedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.archivedate
     *
     * @param archivedate the value for t_genealogy.archivedate
     *
     * @mbggenerated
     */
    public void setArchivedate(Date archivedate) {
        this.archivedate = archivedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.archivedsc
     *
     * @return the value of t_genealogy.archivedsc
     *
     * @mbggenerated
     */
    public String getArchivedsc() {
        return archivedsc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.archivedsc
     *
     * @param archivedsc the value for t_genealogy.archivedsc
     *
     * @mbggenerated
     */
    public void setArchivedsc(String archivedsc) {
        this.archivedsc = archivedsc == null ? null : archivedsc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.capacity
     *
     * @return the value of t_genealogy.capacity
     *
     * @mbggenerated
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.capacity
     *
     * @param capacity the value for t_genealogy.capacity
     *
     * @mbggenerated
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.ip
     *
     * @return the value of t_genealogy.ip
     *
     * @mbggenerated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.ip
     *
     * @param ip the value for t_genealogy.ip
     *
     * @mbggenerated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.delstate
     *
     * @return the value of t_genealogy.delstate
     *
     * @mbggenerated
     */
    public Boolean getDelstate() {
        return delstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.delstate
     *
     * @param delstate the value for t_genealogy.delstate
     *
     * @mbggenerated
     */
    public void setDelstate(Boolean delstate) {
        this.delstate = delstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.approval
     *
     * @return the value of t_genealogy.approval
     *
     * @mbggenerated
     */
    public Integer getApproval() {
        return approval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.approval
     *
     * @param approval the value for t_genealogy.approval
     *
     * @mbggenerated
     */
    public void setApproval(Integer approval) {
        this.approval = approval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.styleedition
     *
     * @return the value of t_genealogy.styleedition
     *
     * @mbggenerated
     */
    public Byte getStyleedition() {
        return styleedition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.styleedition
     *
     * @param styleedition the value for t_genealogy.styleedition
     *
     * @mbggenerated
     */
    public void setStyleedition(Byte styleedition) {
        this.styleedition = styleedition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.partnerId
     *
     * @return the value of t_genealogy.partnerId
     *
     * @mbggenerated
     */
    public String getPartnerid() {
        return partnerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.partnerId
     *
     * @param partnerid the value for t_genealogy.partnerId
     *
     * @mbggenerated
     */
    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid == null ? null : partnerid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.ebook
     *
     * @return the value of t_genealogy.ebook
     *
     * @mbggenerated
     */
    public String getEbook() {
        return ebook;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.ebook
     *
     * @param ebook the value for t_genealogy.ebook
     *
     * @mbggenerated
     */
    public void setEbook(String ebook) {
        this.ebook = ebook == null ? null : ebook.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.city
     *
     * @return the value of t_genealogy.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.city
     *
     * @param city the value for t_genealogy.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.citytown
     *
     * @return the value of t_genealogy.citytown
     *
     * @mbggenerated
     */
    public String getCitytown() {
        return citytown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.citytown
     *
     * @param citytown the value for t_genealogy.citytown
     *
     * @mbggenerated
     */
    public void setCitytown(String citytown) {
        this.citytown = citytown == null ? null : citytown.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.primeGenealogy
     *
     * @return the value of t_genealogy.primeGenealogy
     *
     * @mbggenerated
     */
    public Byte getPrimegenealogy() {
        return primegenealogy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.primeGenealogy
     *
     * @param primegenealogy the value for t_genealogy.primeGenealogy
     *
     * @mbggenerated
     */
    public void setPrimegenealogy(Byte primegenealogy) {
        this.primegenealogy = primegenealogy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.isfirst
     *
     * @return the value of t_genealogy.isfirst
     *
     * @mbggenerated
     */
    public Boolean getIsfirst() {
        return isfirst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.isfirst
     *
     * @param isfirst the value for t_genealogy.isfirst
     *
     * @mbggenerated
     */
    public void setIsfirst(Boolean isfirst) {
        this.isfirst = isfirst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.top
     *
     * @return the value of t_genealogy.top
     *
     * @mbggenerated
     */
    public Boolean getTop() {
        return top;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.top
     *
     * @param top the value for t_genealogy.top
     *
     * @mbggenerated
     */
    public void setTop(Boolean top) {
        this.top = top;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.inferioritydsc
     *
     * @return the value of t_genealogy.inferioritydsc
     *
     * @mbggenerated
     */
    public String getInferioritydsc() {
        return inferioritydsc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.inferioritydsc
     *
     * @param inferioritydsc the value for t_genealogy.inferioritydsc
     *
     * @mbggenerated
     */
    public void setInferioritydsc(String inferioritydsc) {
        this.inferioritydsc = inferioritydsc == null ? null : inferioritydsc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.type
     *
     * @return the value of t_genealogy.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.type
     *
     * @param type the value for t_genealogy.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.price
     *
     * @return the value of t_genealogy.price
     *
     * @mbggenerated
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.price
     *
     * @param price the value for t_genealogy.price
     *
     * @mbggenerated
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.payStatus
     *
     * @return the value of t_genealogy.payStatus
     *
     * @mbggenerated
     */
    public Boolean getPaystatus() {
        return paystatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.payStatus
     *
     * @param paystatus the value for t_genealogy.payStatus
     *
     * @mbggenerated
     */
    public void setPaystatus(Boolean paystatus) {
        this.paystatus = paystatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.discount
     *
     * @return the value of t_genealogy.discount
     *
     * @mbggenerated
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.discount
     *
     * @param discount the value for t_genealogy.discount
     *
     * @mbggenerated
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.watermarkUrl
     *
     * @return the value of t_genealogy.watermarkUrl
     *
     * @mbggenerated
     */
    public String getWatermarkurl() {
        return watermarkurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.watermarkUrl
     *
     * @param watermarkurl the value for t_genealogy.watermarkUrl
     *
     * @mbggenerated
     */
    public void setWatermarkurl(String watermarkurl) {
        this.watermarkurl = watermarkurl == null ? null : watermarkurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_genealogy.watermarkType
     *
     * @return the value of t_genealogy.watermarkType
     *
     * @mbggenerated
     */
    public Integer getWatermarktype() {
        return watermarktype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_genealogy.watermarkType
     *
     * @param watermarktype the value for t_genealogy.watermarkType
     *
     * @mbggenerated
     */
    public void setWatermarktype(Integer watermarktype) {
        this.watermarktype = watermarktype;
    }
}