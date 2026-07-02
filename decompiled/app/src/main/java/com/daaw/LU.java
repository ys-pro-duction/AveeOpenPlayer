package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class LU extends AbstractC8524te {
    public final View[] C;

    public LU(Context context, ViewGroup viewGroup) {
        super(AbstractC1765Ob1.p(context).inflate(AbstractC9815yD0.h0, viewGroup, false));
        this.C = new View[]{view.findViewById(AbstractC5056hD0.a1), view.findViewById(AbstractC5056hD0.g1)};
        View view = this.a;
        AbstractC8524te.R(new TextView[]{(TextView) view.findViewById(AbstractC5056hD0.C3), (TextView) view.findViewById(AbstractC5056hD0.J3)}, context);
    }

    @Override // com.daaw.AbstractC6851ne, com.daaw.AbstractC1464Le
    public void Q(NW nw, int i) {
        super.Q(nw, i);
        this.C[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.JU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC8524te.z.a(120, view);
            }
        });
        this.C[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.KU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC8524te.z.a(125, view);
            }
        });
    }
}
