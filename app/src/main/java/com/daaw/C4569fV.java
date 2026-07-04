package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.daaw.C10217zg1;
import com.daaw.NW;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.fV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4569fV extends AbstractC8524te {
    public final ImageView[] C;
    public final int D;
    public final List E;

    public C4569fV(Context context, ViewGroup viewGroup) {
        super(AbstractC1765Ob1.p(context).inflate(AbstractC9815yD0.m0, viewGroup, false));
        ImageView[] imageViewArr = new ImageView[7];
        this.C = imageViewArr;
        this.E = new LinkedList();
        View view = this.a;
        this.D = AbstractC1765Ob1.n(view, IC0.c);
        TextView[] textViewArr = {(TextView) view.findViewById(AbstractC5056hD0.C3), (TextView) view.findViewById(AbstractC5056hD0.E3), (TextView) view.findViewById(AbstractC5056hD0.F3), (TextView) view.findViewById(AbstractC5056hD0.G3), (TextView) view.findViewById(AbstractC5056hD0.H3), (TextView) view.findViewById(AbstractC5056hD0.I3), (TextView) view.findViewById(AbstractC5056hD0.I3)};
        imageViewArr[3] = (ImageView) view.findViewById(AbstractC5056hD0.o);
        imageViewArr[4] = (ImageView) view.findViewById(AbstractC5056hD0.p);
        imageViewArr[5] = (ImageView) view.findViewById(AbstractC5056hD0.q);
        imageViewArr[6] = (ImageView) view.findViewById(AbstractC5056hD0.r);
        AbstractC8524te.R(textViewArr, context);
        View[] viewArr = {view.findViewById(AbstractC5056hD0.a1), view.findViewById(AbstractC5056hD0.b1), view.findViewById(AbstractC5056hD0.c1), view.findViewById(AbstractC5056hD0.d1), view.findViewById(AbstractC5056hD0.e1), view.findViewById(AbstractC5056hD0.f1), view.findViewById(AbstractC5056hD0.g1)};
        viewArr[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.UU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC8524te.z.a(110, view2);
            }
        });
        viewArr[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.WU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC8524te.z.a(111, view2);
            }
        });
        viewArr[1].setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daaw.XU
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return C4569fV.V(view2);
            }
        });
        viewArr[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.YU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC8524te.z.a(112, view2);
            }
        });
        viewArr[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ZU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC8524te.z.a(113, view2);
            }
        });
        viewArr[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.aV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC8524te.z.a(114, view2);
            }
        });
        viewArr[5].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.bV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC8524te.z.a(115, view2);
            }
        });
        viewArr[6].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.cV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC8524te.z.a(125, view2);
            }
        });
    }

    public static /* synthetic */ boolean V(View view) {
        AbstractC8524te.z.a(1110, view);
        return true;
    }

    @Override // com.daaw.AbstractC6851ne, com.daaw.AbstractC1464Le
    public void Q(NW nw, int i) {
        super.Q(nw, i);
        this.E.clear();
        nw.w().b(new C10217zg1.a() { // from class: com.daaw.dV
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.c0(((Integer) obj).intValue());
            }
        }, this.E);
        nw.w().e(new C10217zg1.a() { // from class: com.daaw.eV
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.a0(((Boolean) obj).booleanValue());
            }
        }, this.E);
        nw.w().g(new C10217zg1.a() { // from class: com.daaw.VU
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.b0(((Boolean) obj).booleanValue());
            }
        }, this.E);
        boolean zBooleanValue = ((Boolean) AbstractC8524te.v.a(Boolean.FALSE)).booleanValue();
        boolean zB = nw.b();
        a0(zBooleanValue);
        b0(zB);
        NW.b bVarW = nw.w();
        if (bVarW != null) {
            c0(bVarW.c());
        }
    }

    public void a0(boolean z) {
        if (!z) {
            this.C[4].setColorFilter(this.D);
        } else {
            ImageView imageView = this.C[4];
            imageView.setColorFilter(AbstractC1765Ob1.n(imageView, IC0.e));
        }
    }

    public void b0(boolean z) {
        if (!z) {
            this.C[5].setColorFilter(this.D);
        } else {
            ImageView imageView = this.C[5];
            imageView.setColorFilter(AbstractC1765Ob1.n(imageView, IC0.e));
        }
    }

    public void c0(int i) {
        if (i == 0) {
            this.C[3].setColorFilter(this.D);
        } else {
            ImageView imageView = this.C[3];
            imageView.setColorFilter(AbstractC1765Ob1.n(imageView, IC0.e));
        }
    }
}
