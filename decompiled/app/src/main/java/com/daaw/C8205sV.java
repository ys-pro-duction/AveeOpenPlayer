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

/* JADX INFO: renamed from: com.daaw.sV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8205sV extends AbstractC8524te {
    public final ImageView[] C;
    public final View[] D;
    public final int E;
    public final List F;

    public C8205sV(Context context, ViewGroup viewGroup) {
        super(AbstractC1765Ob1.p(context).inflate(AbstractC9815yD0.o0, viewGroup, false), false);
        ImageView[] imageViewArr = new ImageView[5];
        this.C = imageViewArr;
        this.D = new View[]{null, null, view.findViewById(AbstractC5056hD0.e1), view.findViewById(AbstractC5056hD0.f1), view.findViewById(AbstractC5056hD0.g1)};
        this.F = new LinkedList();
        View view = this.a;
        this.E = AbstractC1765Ob1.n(view, IC0.c);
        TextView[] textViewArr = {null, null, (TextView) view.findViewById(AbstractC5056hD0.H3), (TextView) view.findViewById(AbstractC5056hD0.I3), (TextView) view.findViewById(AbstractC5056hD0.J3)};
        imageViewArr[3] = (ImageView) view.findViewById(AbstractC5056hD0.q);
        AbstractC8524te.R(textViewArr, context);
    }

    @Override // com.daaw.AbstractC6851ne, com.daaw.AbstractC1464Le
    public void Q(NW nw, int i) {
        super.Q(nw, i);
        this.F.clear();
        NW.b bVarW = nw.w();
        if (bVarW != null) {
            bVarW.g(new C10217zg1.a() { // from class: com.daaw.oV
                @Override // com.daaw.C10217zg1.a
                public final void invoke(Object obj) {
                    this.a.V(((Boolean) obj).booleanValue());
                }
            }, this.F);
        }
        this.D[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.pV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC8524te.w.a(view);
            }
        });
        this.D[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.qV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC8524te.z.a(115, view);
            }
        });
        this.D[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.rV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC8524te.z.a(125, view);
            }
        });
        V(nw.b());
    }

    public void V(boolean z) {
        if (!z) {
            this.C[3].setColorFilter(this.E);
        } else {
            ImageView imageView = this.C[3];
            imageView.setColorFilter(AbstractC1765Ob1.n(imageView, IC0.e));
        }
    }
}
