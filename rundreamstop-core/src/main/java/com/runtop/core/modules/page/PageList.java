
package com.runtop.core.modules.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public class PageList<T> extends ArrayList<T> implements Serializable {

    private static final long serialVersionUID = -2600641086647933030L;
    private Paginator paginator;

    public PageList() {
        this.paginator = new Paginator();
    }

    public PageList(Collection<T> c) {
        this(c, (Paginator) null);
    }

    public PageList(Collection<T> c, Paginator paginator) {
        super(c);
        this.paginator = paginator == null ? new Paginator() : paginator;
    }

    public Paginator getPaginator() {
        return this.paginator;
    }

    public void setPaginator(Paginator paginator) {
        if (paginator != null) {
            this.paginator = paginator;
        }

    }

    public int getPageSize() {
        return this.paginator.getItemsPerPage();
    }

    public int getTotalItem() {
        return this.paginator.getItems();
    }

    public int getTotalPage() {
        return this.paginator.getPages();
    }

    public void setPageSize(int i) {
        this.paginator.setItemsPerPage(i);
    }

    public void setTotalItem(int i) {
        this.paginator.setItems(i);
    }

    public void setTotalPage(int i) {
        this.setTotalItem(i * this.getPageSize());
    }
}
