package com.daaw;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public abstract class A90 {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        G10.g(charSequence, "text");
        G10.g(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new C9119vk(charSequence, 0, charSequence.length()));
        PriorityQueue<C0576Cs0> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: com.daaw.z90
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return A90.d((C0576Cs0) obj, (C0576Cs0) obj2);
            }
        });
        int next = lineInstance.next();
        int i = 0;
        while (next != -1) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C0576Cs0(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                C0576Cs0 c0576Cs0 = (C0576Cs0) priorityQueue.peek();
                if (c0576Cs0 != null && ((Number) c0576Cs0.d()).intValue() - ((Number) c0576Cs0.c()).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new C0576Cs0(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            int i2 = next;
            next = lineInstance.next();
            i = i2;
        }
        float fMax = 0.0f;
        for (C0576Cs0 c0576Cs02 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) c0576Cs02.a()).intValue(), ((Number) c0576Cs02.b()).intValue(), textPaint));
        }
        return fMax;
    }

    public static final int d(C0576Cs0 c0576Cs0, C0576Cs0 c0576Cs02) {
        return (((Number) c0576Cs0.d()).intValue() - ((Number) c0576Cs0.c()).intValue()) - (((Number) c0576Cs02.d()).intValue() - ((Number) c0576Cs02.c()).intValue());
    }

    public static final boolean e(float f, CharSequence charSequence, TextPaint textPaint) {
        if (f == 0.0f || !(charSequence instanceof Spanned)) {
            return false;
        }
        if (textPaint.getLetterSpacing() != 0.0f) {
            return true;
        }
        Spanned spanned = (Spanned) charSequence;
        return AbstractC3446bV0.a(spanned, C9354wb0.class) || AbstractC3446bV0.a(spanned, C9075vb0.class);
    }
}
