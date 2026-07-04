package com.daaw;

/* JADX INFO: renamed from: com.daaw.pF2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7308pF2 {
    public static String a(BM1 bm1) {
        StringBuilder sb = new StringBuilder(bm1.s());
        for (int i = 0; i < bm1.s(); i++) {
            byte bE = bm1.e(i);
            if (bE == 34) {
                sb.append("\\\"");
            } else if (bE == 39) {
                sb.append("\\'");
            } else if (bE != 92) {
                switch (bE) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bE < 32 || bE > 126) {
                            sb.append('\\');
                            sb.append((char) (((bE >>> 6) & 3) + 48));
                            sb.append((char) (((bE >>> 3) & 7) + 48));
                            sb.append((char) ((bE & 7) + 48));
                        } else {
                            sb.append((char) bE);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
