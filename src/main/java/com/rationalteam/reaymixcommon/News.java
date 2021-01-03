/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rationalteam.reaymixcommon;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * @author mutaz
 */
public class News implements Serializable {
    protected String title;
    protected String details;
    protected String ondate;
    private Calendar date = GregorianCalendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public News() {
        ondate =sdf.format(date.getTime());
    }

    public News(String t) {
        ondate =sdf.format(date.getTime());
        title = t;
    }

    public News(String t, String det) {
        {
            ondate = sdf.format(date.getTime());
            title = t;
            details = det;
        }
    }


    /**
     * @return the _title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the _title to set
     */
    public void setTitle(String title) {
        this.title = title;

    }

    /**
     * @return the _details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details the _details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }


    public boolean IsEmpty() {
        boolean r = title == null && details == null;
        r = r || (this.title.isEmpty() && this.details.isEmpty());
        return r;
    }

//    public static List<News> getCustomerNews(int custid) {
//        try {
//            List<TblNews> news = null;
//            List<CNews> nlist = new ArrayList<>();
//            EntityManager eman = MezoDB.getPersistance(getObjectPersistanceName(CNews.class));
//            javax.persistence.Query q = null;
//            q = eman.createNamedQuery("TblNews.findByCustid");
//            q.setParameter("custid", custid);
//            news = q.getResultList();
//            eman.close();
//            if (news != null) {
//                for (TblNews tn : news) {
//                    CNews n = new CNews(tn);
//                    nlist.add(n);
//                }
//            }
//            return nlist;
//        } catch (Exception exp) {
//            CMezoTools.ShowError(exp);
//            return null;
//        }
//    }

    public String getOndate() {
        return ondate;
    }

    public void setOndate(String ondate) {
        this.ondate = ondate;
    }

    @Override
    public String toString() {
        return Objects.isNull(title) ? "Null" : title;
    }

}
