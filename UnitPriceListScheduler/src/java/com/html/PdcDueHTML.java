/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.html;

/**
 *
 * @author Ibrahim
 */
public class PdcDueHTML {

    public static String getMailBdy() {
        String htmlBody = "<html><head><style>\n" +
"  table.paleBlueRows {\n" +
"  font-family: \"Times New Roman\", Times, serif;\n" +
"  border: 1px solid #FFFFFF;\n" +
"  width: 900px;\n" +
"  height: 200px;\n" +
"  text-align: center; \n" +
"}\n" +
"table.paleBlueRows td, table.paleBlueRows th {\n" +
"  border: 1px solid #FFFFFF;\n" +
"  padding: 3px 2px;\n" +
"}\n" +
"table.paleBlueRows tbody td {\n" +
"  font-size: 16px;\n" +
"  height: 200px;\n" +
"} \n" +
"table.paleBlueRows thead {\n" +
"  background: #157bb3;\n" +
"  border-bottom: 10px solid #FFFFFF;\n" +
"}\n" +
"table.paleBlueRows thead th {\n" +
"  font-size: 18px;\n" +
"  font-weight: bold;\n" +
"  color: #FFFFFF;\n" +
"  text-align: center;\n" +
"  border-left: 2px solid #FFFFFF;\n" +
"}\n" +
"table.paleBlueRows thead th:first-child {\n" +
"  border-left: none;\n" +
"} \n" +
"  </style>\n" +
"  </head>\n" +
"  <body>\n" +
"  <table class=\"paleBlueRows\">\n" +
"<thead>\n" +
"<tr>\n" +
"<th>PDC Due Alert Report</th> \n" +
"</tr>\n" +
"</thead> \n" +
"<tbody>\n" +
"<tr>\n" +
"<td><p>Dear All,</p>Good Day! Please find the attachment of PDC Due Alert Report.</td>  \n" +
"</tr>\n" +
"</tbody>\n" +
"   <tfoot>\n" +
"<tr>\n" +
"<td style=\"font-size: 14px;color: #333333;background: #D0E4F5;border-top: 2px solid #444444;\">\n" +
"  <p>Regards,</p>\n" +
"<p>PRISM Administrator Team.</p>\n" +
"  </td>  \n" +
"</tr>\n" +
"</tfoot>\n" +
"</table>\n" +
"  </body>\n" +
"</html>";

        return htmlBody;
    }
}
