package Utlis;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.TabableView;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.isydata.recrutement.entities.CV;
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;



public class CvPdf extends AbstractPdfView{

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        response.setHeader("Content-Disposition", "attachment; filename=\"livreurs_list.pdf\"");
       
        @SuppressWarnings("unchecked")
        CV cv=  (CV) model.get("cvList");

        Table table = new Table(2);
        table.addCell("id CV");
        table.addCell("nom CANDIDAT");
       
           
            table.addCell(String.valueOf(cv.getIdCv()));
            table.addCell(cv.getCandidat().getNom());
        
document.add(table);
    }

}