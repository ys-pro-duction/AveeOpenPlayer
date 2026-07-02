package com.daaw;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.daaw.je1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5728je1 {
    public static AbstractC1464Le a(Context context, ViewGroup viewGroup, int i, NW nw) {
        switch (i) {
            case 0:
                return new C6363ls(viewGroup);
            case 1:
                return new UO(context, viewGroup, 0);
            case 2:
                return new PU(context, viewGroup);
            case 3:
                return new OU(context, viewGroup);
            case 4:
                return new C4569fV(context, viewGroup);
            case 5:
                return new LU(context, viewGroup);
            case 6:
                return new TU(context, viewGroup);
            case 7:
                return new GU(context, viewGroup, nw);
            case 8:
                return new HU(context, viewGroup, nw);
            case 9:
                return new NU(context, viewGroup);
            case 10:
                return new C10165zV(context, viewGroup);
            case 11:
                return new C6811nV(context, viewGroup);
            case 12:
                return new C9301wO0(context, viewGroup);
            case 13:
                return new VO(context, viewGroup);
            case 14:
                return new C8205sV(context, viewGroup);
            case 15:
                return new UO(context, viewGroup, 1);
            case 16:
                return new UO(context, viewGroup, 2);
            default:
                AbstractC6278lb.k("viewType: " + i);
                return null;
        }
    }
}
