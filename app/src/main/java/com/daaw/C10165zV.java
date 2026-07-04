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

/* JADX INFO: renamed from: com.daaw.zV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10165zV extends AbstractC8524te {
    public final ImageView[] C;
    public final View[] D;
    public final int E;
    public final List F;

    public C10165zV(Context context, ViewGroup viewGroup) {
        super(AbstractC1765Ob1.p(context).inflate(AbstractC9815yD0.n0, viewGroup, false));
        ImageView[] imageViewArr = new ImageView[5];
        this.C = imageViewArr;
        this.D = new View[]{view.findViewById(AbstractC5056hD0.a1), view.findViewById(AbstractC5056hD0.b1), view.findViewById(AbstractC5056hD0.e1), view.findViewById(AbstractC5056hD0.f1), view.findViewById(AbstractC5056hD0.g1)};
        this.F = new LinkedList();
        View view = this.a;
        this.E = AbstractC1765Ob1.n(view, IC0.c);
        TextView[] textViewArr = {(TextView) view.findViewById(AbstractC5056hD0.C3), (TextView) view.findViewById(AbstractC5056hD0.E3), (TextView) view.findViewById(AbstractC5056hD0.H3), (TextView) view.findViewById(AbstractC5056hD0.I3), (TextView) view.findViewById(AbstractC5056hD0.J3)};
        imageViewArr[3] = (ImageView) view.findViewById(AbstractC5056hD0.q);
        AbstractC8524te.R(textViewArr, context);
    }

    @Override // com.daaw.AbstractC6851ne, com.daaw.AbstractC1464Le
    public void Q(final NW nw, int i) {
        super.Q(nw, i);
        this.F.clear();
        NW.b bVarW = nw.w();
        if (bVarW != null) {
            bVarW.g(new C10217zg1.a() { // from class: com.daaw.tV
                @Override // com.daaw.C10217zg1.a
                public final void invoke(Object obj) {
                    this.a.X(((Boolean) obj).booleanValue());
                }
            }, this.F);
        }
        this.D[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.uV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nw.l(0);
            }
        });
        this.D[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.vV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nw.l(1);
            }
        });
        this.D[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.wV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC8524te.y.a(view);
            }
        });
        this.D[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.xV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC8524te.z.a(115, view);
            }
        });
        this.D[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.yV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC8524te.z.a(125, view);
            }
        });
        X(nw.b());
    }

    public void X(boolean z) {
        if (!z) {
            this.C[3].setColorFilter(this.E);
        } else {
            ImageView imageView = this.C[3];
            imageView.setColorFilter(AbstractC1765Ob1.n(imageView, IC0.e));
        }
    }
}
