package Utlis;



import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.isydata.recrutement.entities.CV;



public class CvExcel extends AbstractXlsView{

    @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
response.setHeader("Content-Disposition", "attachment; filename=\"cv_list.xls\"" );

@SuppressWarnings("unchecked")
List<CV> list= (List<CV>) model.get("xlsList");

        Sheet sheet= workbook.createSheet("Cv Liste");
        Row header=sheet.createRow(0);
        header.createCell(0).setCellValue("matricule");
        header.createCell(1).setCellValue("Nom");
        header.createCell(2).setCellValue("Prenom");
//        header.createCell(1).setCellValue("cv isydata");
//        header.createCell(1).setCellValue("cv candidat");
//        header.createCell(1).setCellValue("Formation");
//        header.createCell(1).setCellValue("disponibilité");
//        header.createCell(1).setCellValue("mobilité");

int rowNum=1;
for(CV cv : list) {
    Row row = sheet.createRow(rowNum++);
    row.createCell(0).setCellValue(cv.getIdCv());
    row.createCell(1).setCellValue(cv.getCandidat().getNom());
    row.createCell(2).setCellValue(cv.getCandidat().getPrenom());

   
   
}

       
    }

}

