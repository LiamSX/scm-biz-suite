
package com.doublechaintech.retailscm.slide;
import com.doublechaintech.retailscm.Beans;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.math.BigDecimal;
import com.doublechaintech.retailscm.BaseRowMapper;
import com.doublechaintech.retailscm.page.Page;

public class SlideMapper extends BaseRowMapper<Slide>{

	protected Slide internalMapRow(ResultSet rs, int rowNumber) throws SQLException{
		Slide slide = getSlide();
		
 		setId(slide, rs, rowNumber);
 		setName(slide, rs, rowNumber);
 		setDisplayOrder(slide, rs, rowNumber);
 		setImageUrl(slide, rs, rowNumber);
 		setVideoUrl(slide, rs, rowNumber);
 		setLinkToUrl(slide, rs, rowNumber);
 		setPage(slide, rs, rowNumber);
 		setVersion(slide, rs, rowNumber);

    
		return slide;
	}

	protected Slide getSlide(){
	  Slide entity = new Slide();
	  Beans.dbUtil().markEnhanced(entity);
		return entity;
	}
		
	protected void setId(Slide slide, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		String id = rs.getString(SlideTable.COLUMN_ID);
		
		if(id == null){
			//do nothing when nothing found in database
			return;
		}
		
		slide.setId(id);
		}catch (SQLException e){

    }
	}
		
	protected void setName(Slide slide, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		String name = rs.getString(SlideTable.COLUMN_NAME);
		
		if(name == null){
			//do nothing when nothing found in database
			return;
		}
		
		slide.setName(name);
		}catch (SQLException e){

    }
	}
		
	protected void setDisplayOrder(Slide slide, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		Integer displayOrder = rs.getInt(SlideTable.COLUMN_DISPLAY_ORDER);
		
		if(displayOrder == null){
			//do nothing when nothing found in database
			return;
		}
		
		slide.setDisplayOrder(displayOrder);
		}catch (SQLException e){

    }
	}
		
	protected void setImageUrl(Slide slide, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		String imageUrl = rs.getString(SlideTable.COLUMN_IMAGE_URL);
		
		if(imageUrl == null){
			//do nothing when nothing found in database
			return;
		}
		
		slide.setImageUrl(imageUrl);
		}catch (SQLException e){

    }
	}
		
	protected void setVideoUrl(Slide slide, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		String videoUrl = rs.getString(SlideTable.COLUMN_VIDEO_URL);
		
		if(videoUrl == null){
			//do nothing when nothing found in database
			return;
		}
		
		slide.setVideoUrl(videoUrl);
		}catch (SQLException e){

    }
	}
		
	protected void setLinkToUrl(Slide slide, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		String linkToUrl = rs.getString(SlideTable.COLUMN_LINK_TO_URL);
		
		if(linkToUrl == null){
			//do nothing when nothing found in database
			return;
		}
		
		slide.setLinkToUrl(linkToUrl);
		}catch (SQLException e){

    }
	}
		
 	protected void setPage(Slide slide, ResultSet rs, int rowNumber) throws SQLException{
 		String pageId;
 		try{
 		  pageId = rs.getString(SlideTable.COLUMN_PAGE);
 		}catch(SQLException e){
 		  return;
 		}
 		if( pageId == null){
 			return;
 		}
 		if( pageId.isEmpty()){
 			return;
 		}
 		Page page = slide.getPage();
 		if( page != null ){
 			//if the root object 'slide' already have the property, just set the id for it;
 			page.setId(pageId);

 			return;
 		}
 		slide.setPage(createEmptyPage(pageId));
 	}
 	
	protected void setVersion(Slide slide, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		Integer version = rs.getInt(SlideTable.COLUMN_VERSION);
		
		if(version == null){
			//do nothing when nothing found in database
			return;
		}
		
		slide.setVersion(version);
		}catch (SQLException e){

    }
	}
		


 	protected Page  createEmptyPage(String pageId){
 		Page page = new Page();
 		page.setId(pageId);
 		page.setVersion(Integer.MAX_VALUE);
 		return page;
 	}
 	
}


