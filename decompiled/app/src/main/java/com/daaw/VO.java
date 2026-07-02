package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.NW;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class VO extends AbstractC6851ne implements NW.a {
    public TextView v;
    public TextView w;
    public String x;

    public VO(Context context, ViewGroup viewGroup) {
        super(AbstractC1765Ob1.p(context).inflate(AbstractC9815yD0.b0, viewGroup, false), 1, true);
        this.x = null;
        View view = this.a;
        this.v = (TextView) view.findViewById(AbstractC5056hD0.u3);
        this.w = (TextView) view.findViewById(AbstractC5056hD0.v3);
    }

    @Override // com.daaw.AbstractC6851ne, com.daaw.AbstractC1464Le
    public void Q(NW nw, int i) {
        super.Q(nw, i);
        this.v.setText("");
        this.w.setText("");
        nw.n(new WeakReference(this));
        R();
    }

    @Override // com.daaw.NW.a
    public void a(String str) {
        this.x = str;
    }

    @Override // com.daaw.NW.a
    public void b(int i, int i2, boolean z, boolean z2) {
        if (z) {
            this.v.setText(JD0.b5);
            this.w.setText(i >= 0 ? this.w.getResources().getQuantityString(FD0.g, i, Integer.valueOf(i)) : "");
        } else if (i == 0) {
            this.v.setText(JD0.c4);
            this.w.setText("");
        } else {
            this.v.setText("");
            this.w.setText(this.w.getResources().getQuantityString(FD0.g, i, Integer.valueOf(i)));
        }
    }

    private void R() {
    }
}
