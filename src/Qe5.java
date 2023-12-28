public class Qe5 {
    /*

    إن الفرق بين اختبار المساواة الضحل والعميق في Java
     هو أن الاختبار الضحل يتحقق مما إذا كانت المصفوفات هي نفس الكائن في الذاكرة (أي لها نفس عنوان الذاكرة) ،
    بينما يتحقق الاختبار العميق مما إذا كانت قيم جميع العناصر في كلا المصفوفتين متساوية.

    في لغة الجافا، هناك فرق بين اختبار المساواة الضحلة واختبار المساواة العميقة عند مقارنة المصفوفات.

1. اختبار المساواة الضحلة:
   - بالنسبة لمصفوفات ذات بعد واحد من النوع `int`، يقوم اختبار المساواة الضحلة بمقارنة مراجع المصفوفات `A` و `B`. يتحقق مما إذا كانت `A` و `B` تشيران إلى نفس الموقع في الذاكرة، مما يشير إلى أنهما نفس كائن المصفوفة.
   - بالنسبة لمصفوفات ذات بعدين من النوع `int`، يقوم اختبار المساواة الضحلة أيضًا بمقارنة مراجع المصفوفات `A` و `B`. يتحقق مما إذا كانت `A` و `B` تشيران إلى نفس الموقع في الذاكرة، مما يشير إلى أنهما نفس كائن المصفوفة.
   - اختبار المساواة الضحلة لا يقارن العناصر الفعلية في المصفوفات. إنه يقوم فقط بمقارنة المراجع للمصفوفات إذا كانت هي نفسها.

2. اختبار المساواة العميقة:
   - بالنسبة لمصفوفات ذات بعد واحد من النوع `int`، يقوم اختبار المساواة العميقة بمقارنة العناصر الفردية في المصفوفات `A` و `B`. يتحقق مما إذا كانت كل عنصر مقابل في `A` يساوي العنصر المقابل في `B`.
   - بالنسبة لمصفوفات ذات بعدين من النوع `int`، يقوم اختبار المساواة العميقة أيضًا بمقارنة العناصر الفردية في المصفوفات `A` و `B`. يتحقق مما إذا كانت كل عنصر مقابل في `A` يساوي العنصر المقابل في `B`.
   - اختبار المساواة العميقة يقارن القيم الفعلية للعناصر في المصفوفات.

لأداء اختبار المساواة العميقة، يمكنك استخدام طريقة `Arrays.equals()` المتاحة في فئة `java.util.Arrays`. تقوم هذه الطريقة بمقارنة محتوى المصفوفات وتعيد `true` إذا كانت تحتوي على نفس العناصر بنفس الترتيب.
     */

}