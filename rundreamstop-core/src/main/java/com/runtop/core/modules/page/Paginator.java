
package com.runtop.core.modules.page;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public class Paginator implements Serializable, Cloneable {
    public static final int UNKNOWN_ITEMS = 2147483647;
    private static final long serialVersionUID = -649335001130242342L;
    private int page;
    private int items;
    private int itemsPerPage;

    public Paginator() {
        this(0);
    }

    public Paginator(int itemsPerPage) {
        this(itemsPerPage, UNKNOWN_ITEMS);
    }

    public Paginator(int itemsPerPage, int items) {
        this.items = items >= 0 ? items : 0;
        this.itemsPerPage = itemsPerPage > 0 ? itemsPerPage : 5;
        this.page = this.calcPage(0);
    }

    public int getPages() {
        return (int) Math.ceil((double) this.items / (double) this.itemsPerPage);
    }

    public int getPage() {
        return this.page;
    }

    public int setPage(int page) {
        return this.page = this.calcPage(page);
    }

    public int getItems() {
        return this.items;
    }

    public int setItems(int items) {
        this.items = items >= 0 ? items : 0;
        this.setPage(this.page);
        return this.items;
    }

    public int getItemsPerPage() {
        return this.itemsPerPage;
    }

    public int setItemsPerPage(int itemsPerPage) {
        int tmp = this.itemsPerPage;
        this.itemsPerPage = itemsPerPage > 0 ? itemsPerPage : 5;
        if (this.page > 0) {
            this.setPage((int) ((double) (this.page - 1) * (double) tmp / (double) this.itemsPerPage) + 1);
        }

        return this.itemsPerPage;
    }

    public int getOffset() {
        return this.page > 0 ? this.itemsPerPage * (this.page - 1) : 0;
    }

    public int getLength() {
        return this.page > 0 ? Math.min(this.itemsPerPage * this.page, this.items) - this.itemsPerPage * (this.page - 1) : 0;
    }

    public int getBeginIndex() {
        return this.page > 0 ? this.itemsPerPage * (this.page - 1) : 0;
    }

    public int getEndIndex() {
        return this.page > 0 ? Math.min(this.itemsPerPage * this.page, this.items) : 0;
    }

    public int setItem(int itemOffset) {
        return this.setPage(itemOffset / this.itemsPerPage + 1);
    }

    public int getFirstPage() {
        return this.calcPage(1);
    }

    public int getLastPage() {
        return this.calcPage(this.getPages());
    }

    public int getPreviousPage() {
        return this.calcPage(this.page - 1);
    }

    public int getPreviousPage(int n) {
        return this.calcPage(this.page - n);
    }

    public int getNextPage() {
        return this.calcPage(this.page + 1);
    }

    public int getNextPage(int n) {
        return this.calcPage(this.page + n);
    }

    public boolean isDisabledPage(int page) {
        return page < 1 || page > this.getPages() || page == this.page;
    }

    @JSONField(
            serialize = false
    )
    public int[] getSlider() {
        return this.getSlider(7);
    }

    public int[] getSlider(int width) {
        int pages = this.getPages();
        if (pages >= 1 && width >= 1) {
            if (width > pages) {
                width = pages;
            }

            int[] slider = new int[width];
            int first = this.page - (width - 1) / 2;
            if (first < 1) {
                first = 1;
            }

            if (first + width - 1 > pages) {
                first = pages - width + 1;
            }

            for (int i = 0; i < width; ++i) {
                slider[i] = first + i;
            }

            return slider;
        } else {
            return new int[0];
        }
    }

    protected int calcPage(int page) {
        int pages = this.getPages();
        return pages > 0 ? (page < 1 ? 1 : (page > pages ? pages : page)) : 0;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Exception var2) {
            System.out.println(var2);
            return null;
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Paginator: page ");
        if (this.getPages() < 1) {
            sb.append(this.getPage());
        } else {
            int[] slider = this.getSlider();

            for (int i = 0; i < slider.length; ++i) {
                if (this.isDisabledPage(slider[i])) {
                    sb.append('[').append(slider[i]).append(']');
                } else {
                    sb.append(slider[i]);
                }

                if (i < slider.length - 1) {
                    sb.append('\t');
                }
            }
        }

        sb.append(" of ").append(this.getPages()).append(",\n");
        sb.append("    Showing items ").append(this.getBeginIndex()).append(" to ").append(this.getEndIndex()).append(" (total ").append(this.getItems()).append(" items), ");
        sb.append("offset=").append(this.getOffset()).append(", length=").append(this.getLength());
        return sb.toString();
    }
}
