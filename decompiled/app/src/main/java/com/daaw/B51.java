package com.daaw;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class B51 {
    public View b;
    public final Map a = new HashMap();
    public final ArrayList c = new ArrayList();

    public B51(View view) {
        this.b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof B51)) {
            return false;
        }
        B51 b51 = (B51) obj;
        return this.b == b51.b && this.a.equals(b51.a);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }
}
