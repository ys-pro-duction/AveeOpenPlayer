package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public class HU extends AbstractC8524te implements SearchView.OnQueryTextListener {
    public HU(Context context, ViewGroup viewGroup, NW nw) {
        super(AbstractC1765Ob1.p(context).inflate(AbstractC9815yD0.g0, viewGroup, false));
    }

    @Override // com.daaw.AbstractC6851ne, com.daaw.AbstractC1464Le
    public void Q(NW nw, int i) {
        super.Q(nw, i);
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        return false;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return false;
    }
}
