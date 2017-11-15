package util;

public class Pager {
	private Integer dataCount;
	private Integer pageSize;
	private Integer pageCount;
	private Integer pageNo;
	private int pagerNum;//每页显示页码�?
	public int getPagerNum() {
		if(pagerNum<=2) pagerNum=5;
		return pagerNum;
	}
	public void setPagerNum(int pagerNum) {
		this.pagerNum = pagerNum;
	}
	public Integer getDataCount() {
		return dataCount;
	}
	public void setDataCount(Integer dataCount) {
		this.dataCount = dataCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageCount() {
		if(dataCount<=0) return 0;
		pageCount = (dataCount-1)/this.getPageSize()+1;
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getPageNo() {
		if(pageNo<=0) pageNo=1;
		if(pageNo>this.getPageCount()) pageNo=this.getPageCount();
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	
	public Integer getStart(){
		return (this.getPageNo()-1)*this.pageSize;
	}
	public Integer getEnd(){
		return this.getPageNo()*pageSize;
	}
	
	public int getPrevPageNo(){
		if(this.pageNo<=1) return 1;
		return this.pageNo-1;
	}
	public int getNextPageNo(){
		if(this.pageNo==this.pageCount) return this.pageCount;
		return pageNo+1;
	}
	//从第几页�?��显示页码
		public int getFirstPageNo(){
			if(this.getPageCount()<=this.getPagerNum())
			{
				return 1;			
			}
			else if(this.getPageNo()-this.getPagerNum()/2<=0){
				return 1;
			}
			else if(this.getPageCount()-this.getPageNo()+this.getPagerNum()/2<this.getPagerNum()-1){
				return this.getPageCount()-this.getPagerNum()+1;
			}else{
				return this.getPageNo()-this.getPagerNum()/2;
			}
		}
		//显示页码到第几页
		public int getlastPageNo(){
			if(this.getPageCount()<=this.getPagerNum()){
				return this.getPageCount();
			}else if(this.getPageNo()+this.getPagerNum()/2>=this.getPageCount()){
				return this.getPageCount();
			}else if(this.getPageNo()+this.getPagerNum()/2-1<this.getPagerNum()-1){
				return 1+this.getPagerNum()-1;
			}else{
			
				return this.getPageNo()+this.getPagerNum()/2;
			}
		}
}
