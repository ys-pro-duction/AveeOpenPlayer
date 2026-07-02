package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.daaw.AsyncTaskC2517Vb1;
import com.daaw.NW;

/* JADX INFO: renamed from: com.daaw.wO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9301wO0 extends AbstractC1464Le implements NW.a {
    public ImageButton u;
    public TextView v;

    /* JADX INFO: renamed from: com.daaw.wO0$a */
    public class a implements AsyncTaskC2517Vb1.b {
        public a() {
        }

        @Override // com.daaw.AsyncTaskC2517Vb1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(String str, boolean z) {
            if (z) {
                return;
            }
            C9301wO0.this.v.setText(str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.wO0$b */
    public class b implements View.OnClickListener {
        public final /* synthetic */ NW B;

        public b(NW nw) {
            this.B = nw;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.B.c(!r2.z());
            C9301wO0.this.S(this.B.z());
        }
    }

    public C9301wO0(Context context, ViewGroup viewGroup) {
        super(AbstractC1765Ob1.p(context).inflate(AbstractC9815yD0.B0, viewGroup, false));
        View view = this.a;
        this.u = (ImageButton) view.findViewById(AbstractC5056hD0.w);
        this.v = (TextView) view.findViewById(AbstractC5056hD0.g4);
    }

    @Override // com.daaw.AbstractC1464Le
    public void Q(NW nw, int i) {
        nw.k().a(new a());
        S(nw.z());
        this.u.setOnClickListener(new b(nw));
    }

    public void S(boolean z) {
        if (z) {
            this.u.setImageResource(AbstractC3374bD0.J);
        } else {
            this.u.setImageResource(AbstractC3374bD0.A);
        }
    }

    @Override // com.daaw.NW.a
    public void a(String str) {
    }

    @Override // com.daaw.NW.a
    public void b(int i, int i2, boolean z, boolean z2) {
    }
}
