package com.daaw;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WT0 extends LinearLayoutManager {

    public class a extends androidx.recyclerview.widget.g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public WT0(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void L1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i);
        M1(aVar);
    }
}
