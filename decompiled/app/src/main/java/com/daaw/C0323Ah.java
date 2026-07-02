package com.daaw;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0323Ah extends AbstractC1156If {
    public static final a g = new a(null);
    public static final C0323Ah h = new C0323Ah(1, 0, 7);
    public static final C0323Ah i = new C0323Ah(new int[0]);

    /* JADX INFO: renamed from: com.daaw.Ah$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C0323Ah a(InputStream inputStream) {
            G10.g(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            H00 h00 = new H00(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(h00, 10));
            Iterator it = h00.iterator();
            while (it.hasNext()) {
                ((A00) it).b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrL0 = AbstractC2455Um.L0(arrayList);
            return new C0323Ah(Arrays.copyOf(iArrL0, iArrL0.length));
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323Ah(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        G10.g(iArr, "numbers");
    }

    public boolean h() {
        return f(h);
    }
}
