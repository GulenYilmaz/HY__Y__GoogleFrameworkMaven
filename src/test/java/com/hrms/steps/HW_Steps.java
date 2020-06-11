package com.hrms.steps;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import com.hrms.utils.CommonMethods;
//
//public class HW_Steps extends CommonMethods{
//	public static List<Map<String,String>> excelIntoListOfMaps(String filepath,String sheetName){
//		openExcel(filepath, sheetName);
//		
//		List<Map<String,String>>data=new ArrayList<Map<String,String>>();
//		for(int i=1;i<rowCount();i++) {
//			Map<String,String>map=new HashMap<>();
//			for(int c=0;c<colsCount();c++) {
//				map.put(cellData(0,c), cellData(i,c));
//			}
//			data.add(map);
//		}
//		return data;
//	}
//	
//	//without header
//	public static List<ArrayList<String>> excelIntoListOfList(String filepath,String sheetName){
//		openExcel(filepath, sheetName);
//		
//		List<ArrayList<String>>dataL=new ArrayList<ArrayList<String>>();
//		for(int i=0;i<rowCount();i++) {
//			ArrayList<String>list=new ArrayList<String>();
//			for(int c=0;c<colsCount();c++) {
//				list.add(cellData(i,c));
//			}
//			dataL.add(list);
//		}
//		return dataL;
//	}
//}
