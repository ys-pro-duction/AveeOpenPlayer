package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public abstract class MF {
    public static final Map a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        linkedHashMap.put("None", null);
        linkedHashMap.put("Root", new Supplier() { // from class: com.daaw.yF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new UJ0();
            }
        });
        linkedHashMap.put("Composition", new Supplier() { // from class: com.daaw.HF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C1092Hp();
            }
        });
        linkedHashMap.put("Text", new Supplier() { // from class: com.daaw.IF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C3044a21();
            }
        });
        linkedHashMap.put("Bars", new Supplier() { // from class: com.daaw.JF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new OO0();
            }
        });
        linkedHashMap.put("Particles", new Supplier() { // from class: com.daaw.KF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C4685ft0();
            }
        });
        linkedHashMap.put("Image", new Supplier() { // from class: com.daaw.LF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C6544mY();
            }
        });
        linkedHashMap.put("AudioProvider", new Supplier() { // from class: com.daaw.zF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C2411Ub();
            }
        });
        linkedHashMap.put("BlurEffect", new Supplier() { // from class: com.daaw.AF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C5736jg();
            }
        });
        linkedHashMap.put("RgbSplitEffect", new Supplier() { // from class: com.daaw.BF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C9281wJ0();
            }
        });
        linkedHashMap.put("MotionBlurEffect", new Supplier() { // from class: com.daaw.CF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C7166ol0();
            }
        });
        linkedHashMap.put("MirrorEffect", new Supplier() { // from class: com.daaw.DF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C9399wk0();
            }
        });
        linkedHashMap.put("AppLogo", new Supplier() { // from class: com.daaw.EF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C3486be0();
            }
        });
        linkedHashMap.put("StatText", new Supplier() { // from class: com.daaw.FF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C10141zP();
            }
        });
        linkedHashMap.put("CustomShader", new Supplier() { // from class: com.daaw.GF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C3007Zu();
            }
        });
    }

    public static AbstractC8699uF a(String str, String str2, AbstractC8699uF abstractC8699uF) {
        if ("None".equals(str)) {
            return null;
        }
        Supplier supplier = (Supplier) a.get(str);
        if (supplier != null && !str.equals(c(abstractC8699uF))) {
            try {
                return (AbstractC8699uF) supplier.get();
            } catch (Exception unused) {
                AbstractC0441Bk1.a("Failed to create element for typeName: " + str);
            }
        } else if (supplier == null) {
            AbstractC0441Bk1.a("Unknown typeName: " + str);
        }
        return abstractC8699uF;
    }

    public static String[] b() {
        String[] strArr = {"Root", "AppLogo", "StatText"};
        ArrayList arrayList = new ArrayList();
        for (String str : a.keySet()) {
            if (!str.equals("None") && !Arrays.asList(strArr).contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String c(AbstractC8699uF abstractC8699uF) {
        if (abstractC8699uF == null) {
            return "None";
        }
        for (Map.Entry entry : a.entrySet()) {
            Supplier supplier = (Supplier) entry.getValue();
            if (supplier != null && ((AbstractC8699uF) supplier.get()).getClass().isInstance(abstractC8699uF)) {
                return (String) entry.getKey();
            }
        }
        AbstractC0441Bk1.c("Unknown instance type");
        return "unk";
    }
}
