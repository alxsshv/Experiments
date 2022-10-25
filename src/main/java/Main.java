import java.util.List;

public class Main {
    public static void main(String[] args) {
        String json = "{\n" +
                "\t\"result\":{\n" +
                "\t\t\"count\":61,\n" +
                "\t\t\"start\":0,\n" +
                "\t\t\"rows\":100,\n" +
                "\t\t\"items\":[\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-123536523\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"ТУЛЬСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"69904-17\",\n" +
                "\t\t\t\t\"mit_title\":\"Дальномеры лазерные\",\n" +
                "\t\t\t\t\"mit_notation\":\"ADA Cosmo MINI, MINI 40, 50, 70, 100, 120 VIDEO, 150 VIDEO\",\n" +
                "\t\t\t\t\"mi_modification\":\"ADA COSMO 70\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"13.01.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"12.01.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ВЮ/13-01-2022/123536523\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-137779938\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ФЕРРАТА\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"40607-09\",\n" +
                "\t\t\t\t\"mit_title\":\"Счетчики холодной и горячей воды\",\n" +
                "\t\t\t\t\"mit_notation\":\"ВСХ, ВСХд, ВСГ, ВСГд, ВСТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"ВСТ\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"05.03.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"04.03.2026\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ВЛФ/05-03-2022/137779938\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-141575472\",\n" +
                "\t\t\t\t\"org_title\":\"ПАО \\\"СУРГУТНЕФТЕГАЗ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"60168-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, напоромеры, тягомеры и тягонапоромеры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ФТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП3-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"16.03.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"15.03.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АХД/16-03-2022/141575472\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-138014019\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ОЙЛ-ТЕЛЕКОМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"43902-14\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-Уф, ВП-Уф, МВП-Уф, ДМ8010-Уф, ДВ8010-Уф, ДА8010-Уф\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП4-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"16.02.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"15.02.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ГГП/16-02-2022/138014019\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-147744055\",\n" +
                "\t\t\t\t\"org_title\":\"АО \\\"ПО ФИЗТЕХ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"60168-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, напоромеры, тягомеры и тягонапоромеры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ФТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП3-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"11.04.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"10.04.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ГГИ/11-04-2022/147744055\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-152821692\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"СЕВЕРО-КАВКАЗСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"22986-08\",\n" +
                "\t\t\t\t\"mit_title\":\"Счетчики электрической энергии\",\n" +
                "\t\t\t\t\"mit_notation\":\"СЭА11\",\n" +
                "\t\t\t\t\"mi_modification\":\"СЭА11ДМШ1\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"11.01.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"10.01.2038\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АЬ/27-01-2022/134230203\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-153178387\",\n" +
                "\t\t\t\t\"org_title\":\"АО \\\"ПО ФИЗТЕХ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"60168-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, напоромеры, тягомеры и тягонапоромеры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ФТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП3-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"29.04.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"28.04.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ГГИ/29-04-2022/153178387\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-149725577\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ЗТСО \\\"МЕДТЕХНИКА\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"10135-95\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры, мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП...-У, ВП...-У, МВП...-У\",\n" +
                "\t\t\t\t\"mi_modification\":\"Нет модификации\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"18.03.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"17.03.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БАБ/18-03-2022/149725577\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-154000573\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"САМАРСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"51516-12\",\n" +
                "\t\t\t\t\"mit_title\":\"Трансформаторы тока классов точности 0,5; 0,5S; 1,0\",\n" +
                "\t\t\t\t\"mit_notation\":\"Т-0,66\",\n" +
                "\t\t\t\t\"mi_modification\":\"Т-0,66\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"26.04.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"25.04.2026\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БЯ/26-04-2022/154000573\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-150178211\",\n" +
                "\t\t\t\t\"org_title\":\"ЮВОСТ ТР\",\n" +
                "\t\t\t\t\"mit_number\":\"12207-03\",\n" +
                "\t\t\t\t\"mit_title\":\"Датчики угла поворота\",\n" +
                "\t\t\t\t\"mit_notation\":\"Л178\",\n" +
                "\t\t\t\t\"mi_modification\":\"Л178/1.2\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"12.04.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"11.04.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ВНВ/12-04-2022/150178211\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-144298185\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"КОСТРОМСКОЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"71031-18\",\n" +
                "\t\t\t\t\"mit_title\":\"Трансформаторы тока\",\n" +
                "\t\t\t\t\"mit_notation\":\"Т-0,66 У3 и Т-0,66 М У3\",\n" +
                "\t\t\t\t\"mi_modification\":\"Т-0,66 У3\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"10.01.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"09.01.2030\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БЮ/10-01-2022/144298185\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-144342415\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"КОСТРОМСКОЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"71031-18\",\n" +
                "\t\t\t\t\"mit_title\":\"Трансформаторы тока\",\n" +
                "\t\t\t\t\"mit_notation\":\"Т-0,66 У3 и Т-0,66 М У3\",\n" +
                "\t\t\t\t\"mi_modification\":\"Т-0,66 М У3\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"10.01.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"09.01.2030\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БЮ/10-01-2022/144342415\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-126793357\",\n" +
                "\t\t\t\t\"org_title\":\"ПАО \\\"ХИМЛАБОРПРИБОР\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"91-69\",\n" +
                "\t\t\t\t\"mit_title\":\"Мензурки вместимостью 50, 100, 250, 500, 1000 мл\",\n" +
                "\t\t\t\t\"mit_notation\":\"Нет данных\",\n" +
                "\t\t\t\t\"mi_modification\":\"50 мл\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"14.01.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"31.12.2099\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АИФ/14-01-2022/126793357\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-145793772\",\n" +
                "\t\t\t\t\"org_title\":\"ПАО \\\"ХИМЛАБОРПРИБОР\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"21147-01\",\n" +
                "\t\t\t\t\"mit_title\":\"Бюретки Гемпеля к газоанализатору ГК-1\",\n" +
                "\t\t\t\t\"mit_notation\":\"Нет данных\",\n" +
                "\t\t\t\t\"mi_modification\":\"100 мл\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"24.01.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"31.12.2099\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АИФ/24-01-2022/145793772\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-127613967\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"УРАЛКАЛИЙ-РЕМОНТ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"60168-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, напоромеры, тягомеры и тягонапоромеры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ФТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"ФТ МП4-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"12.01.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"11.01.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ГНЕ/12-01-2022/127613967\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-129852574\",\n" +
                "\t\t\t\t\"org_title\":\"АО \\\"НИИФИ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"1321-60\",\n" +
                "\t\t\t\t\"mit_title\":\"Магазины сопротивления\",\n" +
                "\t\t\t\t\"mit_notation\":\"Р33\",\n" +
                "\t\t\t\t\"mi_modification\":\"Р33\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"27.01.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"26.01.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АЯО/27-01-2022/129852574\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-130875999\",\n" +
                "\t\t\t\t\"org_title\":\"ООО НПО \\\"ЮМАС\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"59554-14\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, дифманометры показывающие и сигнализирующие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП, НП, ЭКН и ЭКМ, ВП, ТП, ЭКТ и ЭКВ, МВП, ТНП, ЭКТН и ЭКМВ, ДП и ЭКД\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП160\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"10.02.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"09.02.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ВЯИ/10-02-2022/130875999\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-131297787\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"КРАСНОЯРСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"32325-06\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры показывающие виброустойчивые\",\n" +
                "\t\t\t\t\"mit_notation\":\"ДМ8008-ВУф, ДВ8008-ВУф, ДА8008-ВУф\",\n" +
                "\t\t\t\t\"mi_modification\":\"ДМ8008-ВуФ\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"14.02.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"13.02.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АШ/14-02-2022/131297787\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-167100211\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ИНЭКС СЕРТ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"26722-04\",\n" +
                "\t\t\t\t\"mit_title\":\"Счетчики электрической энергии однофазные электронные\",\n" +
                "\t\t\t\t\"mit_notation\":\"СОЭБ-Н\",\n" +
                "\t\t\t\t\"mi_modification\":\"СОЭБ-Н/1П\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"08.04.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"07.04.2038\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДИЭ/08-04-2022/167100211\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-167138401\",\n" +
                "\t\t\t\t\"org_title\":\"АО \\\"КОРПОРАЦИЯ \\\"КОМЕТА\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"60168-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, напоромеры, тягомеры и тягонапоромеры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ФТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП3-Уф (0...1,6 МПа; КТ 1,5)\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"23.06.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"22.06.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БПК/23-06-2022/167138401\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-158478469\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"РОСТЕСТ-МОСКВА\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"44051-10\",\n" +
                "\t\t\t\t\"mit_title\":\"Спектроколориметры многоугловые\",\n" +
                "\t\t\t\t\"mit_notation\":\"MA\",\n" +
                "\t\t\t\t\"mi_modification\":\"МА 98\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"25.05.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"24.05.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-МА/25-05-2022/158478469\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-156513029\",\n" +
                "\t\t\t\t\"org_title\":\"ФГУП \\\"ВНИИМ ИМ. Д.И.МЕНДЕЛЕЕВА\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"51474-12\",\n" +
                "\t\t\t\t\"mit_title\":\"Акселерометры персональные специалиста по лифтам\",\n" +
                "\t\t\t\t\"mit_notation\":\"PALS\",\n" +
                "\t\t\t\t\"mi_modification\":\"Нет модификации\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"17.05.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"16.05.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-В/17-05-2022/156513029\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-139979089\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"ЯКУТСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"10135-05\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-У, ВП-У, МВП-У\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП4-УУ2\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"16.03.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"15.03.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АС/16-03-2022/139979089\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-140462679\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"Мордовский ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"4627-75\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-100С, МП-100/1С, МП-100/2С, МП-160С, МП-160КсС, МП-160/1С, МВП-160С, МВП-160КсС, МВП-100ФС, МВП-100КСС\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП-100С, МП-100/1С, МП-100/2С, МП-160С, МП-160КсС, МП-160/1С, МВП-160С, МВП-160КсС, МВП-100ФС, МВП-100КСС\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"17.03.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"16.03.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АК/17-03-2022/140462679\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-139217766\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"Мордовский ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"25913-03\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"ТМ, ТВ, TMB и ТМТБ\",\n" +
                "\t\t\t\t\"mi_modification\":\"ТМ\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"05.03.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"04.03.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АК/05-03-2022/139217766\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-140314120\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ИРИС\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"60168-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, напоромеры, тягомеры и тягонапоромеры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ФТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"ФТ МП4-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"10.03.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"09.03.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДЯП/10-03-2022/140314120\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-170209552\",\n" +
                "\t\t\t\t\"org_title\":\"ПАО \\\"СУРГУТНЕФТЕГАЗ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"60168-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, напоромеры, тягомеры и тягонапоромеры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ФТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП4-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"06.07.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"05.07.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АХД/06-07-2022/170209552\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-167760177\",\n" +
                "\t\t\t\t\"org_title\":\"ООО ИК \\\"СИБИНТЕК\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"43902-14\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-Уф, ВП-Уф, МВП-Уф, ДМ8010-Уф, ДВ8010-Уф, ДА8010-Уф\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП3-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"30.06.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"30.06.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДВК/30-06-2022/167760177\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-179471396\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ЭНЕРТЕСТ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"46971-11\",\n" +
                "\t\t\t\t\"mit_title\":\"Контроллеры терминальные\",\n" +
                "\t\t\t\t\"mit_notation\":\"ТК16L.14\",\n" +
                "\t\t\t\t\"mi_modification\":\"TK16L.14\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"24.06.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"23.06.2028\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДАЭ/24-06-2022/179471396\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-176073689\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ТЕПЛОПРИБОР-СЕНСОР\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"73018-18\",\n" +
                "\t\t\t\t\"mit_title\":\"Термопреобразователи с унифицированным выходным сигналом\",\n" +
                "\t\t\t\t\"mit_notation\":\"ТСМУ, ТСПУ, ТХАУ, ТСМУ-Ех, ТСПУ-Ех, ТХАУ-Ех\",\n" +
                "\t\t\t\t\"mi_modification\":\"ТСМУ-3238-Ex (-50+100)\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"29.07.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"28.07.2026\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ВЦЯ/29-07-2022/176073689\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-180303103\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ИНЭКС СЕРТ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"26722-04\",\n" +
                "\t\t\t\t\"mit_title\":\"Счетчики электрической энергии однофазные электронные\",\n" +
                "\t\t\t\t\"mit_notation\":\"СОЭБ-Н\",\n" +
                "\t\t\t\t\"mi_modification\":\"СОЭБ-Н/1П\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"16.03.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"15.03.2038\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДИЭ/16-03-2022/180303103\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-159451481\",\n" +
                "\t\t\t\t\"org_title\":\"АО \\\"МИКАРД-ЛАНА\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"15492-11\",\n" +
                "\t\t\t\t\"mit_title\":\"Комплексы для автоматизированной интегральной оценки функционального состояния сердечно-сосудистой системы\",\n" +
                "\t\t\t\t\"mit_notation\":\"Кардиометр-МТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"КФС-01.001\",\n" +
                "\t\t\t\t\"mi_number\":\"012559\",\n" +
                "\t\t\t\t\"verification_date\":\"04.05.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"03.05.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДЛУ/04-05-2022/159451481\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-159870664\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"САМАРСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"10135-88\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП3-У, МП3А, МП4-У, ВП3-У, ВП4-У, МВП3А-У, МВП4-У, МВП4А-У\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП3-У\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"27.05.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"26.05.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БЯ/27-05-2022/159870664\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-160011665\",\n" +
                "\t\t\t\t\"org_title\":\"ФИЛИАЛ \\\"АЗОТ\\\" АКЦИОНЕРНОГО ОБЩЕСТВА \\\"ОБЪЕДИНЕННАЯ ХИМИЧЕСКАЯ КОМПАНИЯ \\\"УРАЛХИМ\\\" В ГОРОДЕ БЕРЕЗНИКИ\",\n" +
                "\t\t\t\t\"mit_number\":\"32323-11\",\n" +
                "\t\t\t\t\"mit_title\":\"Мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МПА-Уф, МВПА-Уф, МПАф-Кс, МВПАф-Кс\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП4А-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"16.05.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"15.05.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БВЮ/16-05-2022/160011665\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-160560256\",\n" +
                "\t\t\t\t\"org_title\":\"ФГУП \\\"РФЯЦ - ВНИИТФ ИМ. АКАДЕМ. Е.И. ЗАБАБАХИНА\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"43902-10\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-Уф, ВП-Уф, МВП-Уф, ДМ8010-Уф, ДВ8010-Уф, ДА8010-Уф\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"19.05.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"18.05.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АБУ/19-05-2022/160560256\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-160852036\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ТЕПЛОПРИБОР-СЕНСОР\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"74164-19\",\n" +
                "\t\t\t\t\"mit_title\":\"Датчики температуры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ТР, ТП\",\n" +
                "\t\t\t\t\"mi_modification\":\"ТР 01 02 C J 1 AD1 11 X F 1 4.5\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"25.05.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"24.05.2027\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ВЦЯ/25-05-2022/160852036\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-151512655\",\n" +
                "\t\t\t\t\"org_title\":\"АО \\\"ПНТЗ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"43902-14\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-Уф, ВП-Уф, МВП-Уф, ДМ8010-Уф, ДВ8010-Уф, ДА8010-Уф\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП3-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"19.04.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"18.04.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ББВ/19-04-2022/151512655\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-162520703\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"МЦ \\\"АЛЬФА\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"60168-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, напоромеры, тягомеры и тягонапоромеры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ФТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"ДМ8008-ВУф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"07.06.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"06.06.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДУК/07-06-2022/162520703\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-157684384\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ММЦ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"43902-10\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-Уф, ВП-Уф, МВП-Уф, ДМ8010-Уф, ДВ8010-Уф, ДА8010-Уф\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"18.05.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"17.05.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ГНВ/18-05-2022/157684384\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-158189714\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"РЦМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"43458-09\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МТ-И, МТО, ЭМТ-И (манометры), ВТ-И, ЭВТ-И (вакуумметры), МВТ-И, ММТ, ЭМВТ-И (мановакуумметры)\",\n" +
                "\t\t\t\t\"mi_modification\":\"МТ-3И\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"24.05.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"23.05.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ГЭЧ/24-05-2022/158189714\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-165467710\",\n" +
                "\t\t\t\t\"org_title\":\"ФГБУ \\\"ВНИИМС\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"80093-20\",\n" +
                "\t\t\t\t\"mit_title\":\"Термометры электронные автономные для контроля холодовой цепи \",\n" +
                "\t\t\t\t\"mit_notation\":\"Фармацевт\",\n" +
                "\t\t\t\t\"mi_modification\":\"Т-2\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"23.06.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"22.06.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-М/23-06-2022/165467710\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-164374578\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"ВОЛГОГРАДСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"27227-05\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-Уф, ВП-Уф, МВП-Уф, ДМ8010-Уф, ДВ8010-Уф, ДА8010-Уф\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП4-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"09.06.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"08.06.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БИ/09-06-2022/164374578\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-162078728\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"АРХАНГЕЛЬСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"25913-08\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"ТМ, ТВ, ТМВ и ТМТБ\",\n" +
                "\t\t\t\t\"mi_modification\":\"ТМ серии 10 модели ТМ5\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"06.06.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"05.06.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БВ/06-06-2022/162078728\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-163697812\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"АРХАНГЕЛЬСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"10135-10\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-У, ВП-У и МВП-У\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП-У модели МП4-У\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"10.06.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"09.06.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БВ/10-06-2022/163697812\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-164094875\",\n" +
                "\t\t\t\t\"org_title\":\"ОАО \\\"МЕДТЕХНИКА\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"43902-10\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-Уф, ВП-Уф, МВП-Уф, ДМ8010-Уф, ДВ8010-Уф, ДА8010-Уф\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП4-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"09.06.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"08.06.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АЕЯ/09-06-2022/164094875\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-167494224\",\n" +
                "\t\t\t\t\"org_title\":\"ГУП \\\"МОСКОВСКИЙ МЕТРОПОЛИТЕН\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"60168-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, напоромеры, тягомеры и тягонапоромеры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ФТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП3-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"01.07.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"30.06.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДРЕ/01-07-2022/167494224\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-171052904\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ЦМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"28640-05\",\n" +
                "\t\t\t\t\"mit_title\":\"Счетчики электрической энергии однофазные электронные многотарифные\",\n" +
                "\t\t\t\t\"mit_notation\":\"СОЭБ-2П\",\n" +
                "\t\t\t\t\"mi_modification\":\"исп. СОЭБ-2П К/2\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"02.07.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"01.07.2032\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ГХС/02-07-2022/171052904\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-169626908\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"ИРКУТСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"43902-14\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-Уф, ВП-Уф, МВП-Уф, ДМ8010-Уф, ДВ8010-Уф, ДА8010-Уф\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП3-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"20.06.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"19.06.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БП/20-06-2022/169626908\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-172205031\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"ТЕСТ-С.-ПЕТЕРБУРГ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"43902-14\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-Уф, ВП-Уф, МВП-Уф, ДМ8010-Уф, ДВ8010-Уф, ДА8010-Уф\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"11.07.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"10.07.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-СП/11-07-2022/172205031\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-176482638\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"МСК\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"25913-08\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"ТМ, ТВ, ТМВ и ТМТБ\",\n" +
                "\t\t\t\t\"mi_modification\":\"ТМ5\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"06.08.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"05.08.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДМЛ/06-08-2022/176482638\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-182064570\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"АСТРАХАНСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"18168-10\",\n" +
                "\t\t\t\t\"mit_title\":\"Системы газоаналитические\",\n" +
                "\t\t\t\t\"mit_notation\":\"СКВА-01\",\n" +
                "\t\t\t\t\"mi_modification\":\"СКВА-01\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"25.08.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"24.08.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-БГ/25-08-2022/182064570\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-183512397\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ФЕРРАТА\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"73393-18\",\n" +
                "\t\t\t\t\"mit_title\":\"Термометры биметаллические\",\n" +
                "\t\t\t\t\"mit_notation\":\"БТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"БТ5\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"01.09.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"31.08.2025\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ВЛФ/01-09-2022/183512397\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-184739280\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"КУРСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"66194-16\",\n" +
                "\t\t\t\t\"mit_title\":\"Счетчики холодной и горячей воды тахометрические\",\n" +
                "\t\t\t\t\"mit_notation\":\"GROEN серии Dual, WR, DR, WT\",\n" +
                "\t\t\t\t\"mi_modification\":\"GROEN WRС-15(I)\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"08.09.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"07.09.2028\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ВА/08-09-2022/184739280\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-179913677\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"МЦМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"23751-02\",\n" +
                "\t\t\t\t\"mit_title\":\"Счетчики статические однофазные\",\n" +
                "\t\t\t\t\"mit_notation\":\"СЦЭТТ-11\",\n" +
                "\t\t\t\t\"mi_modification\":\"СЦЭТТ-11\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"18.08.2022\",\n" +
                "\t\t\t\t\"result_docnum\":\"И-ДИО/18-08-2022/179913677\",\n" +
                "\t\t\t\t\"applicability\":false\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-180071284\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"ХАБАРОВСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"84572-22\",\n" +
                "\t\t\t\t\"mit_title\":\"Устройства сбора и передачи данных\",\n" +
                "\t\t\t\t\"mit_notation\":\"ЛЭРС СИ-4\",\n" +
                "\t\t\t\t\"mi_modification\":\"ЛЭРС СИ-4\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"04.08.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"03.05.2028\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-АЮ/04-08-2022/180071284\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-180695158\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ЭТАЛОН РЕГИОН СЕРВИС\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"23991-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, мановакуумметры\",\n" +
                "\t\t\t\t\"mit_notation\":\"МТ, МВТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"МТ-100\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"23.08.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"22.08.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ВСЕ/23-08-2022/180695158\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-193346757\",\n" +
                "\t\t\t\t\"org_title\":\"ФБУ \\\"ТЮМЕНСКИЙ ЦСМ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"24947-03\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры показывающие сигнализирующие\",\n" +
                "\t\t\t\t\"mit_notation\":\"ДМ2010Сг\",\n" +
                "\t\t\t\t\"mi_modification\":\"ДМ2010Cr-У2\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"07.09.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"06.09.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ВЯ/07-09-2022/193346757\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-188426870\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"МЕТРОСЕРВИС\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"82009-21\",\n" +
                "\t\t\t\t\"mit_title\":\"Счетчики тахометрические\",\n" +
                "\t\t\t\t\"mit_notation\":\"GROEN\",\n" +
                "\t\t\t\t\"mi_modification\":\"WRC-15\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"26.01.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"25.01.2028\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДДГ/26-01-2022/128749577\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-188296137\",\n" +
                "\t\t\t\t\"org_title\":\"ООО СТЛ «Мера»\",\n" +
                "\t\t\t\t\"mit_number\":\"43902-10\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-Уф, ВП-Уф, МВП-Уф, ДМ8010-Уф, ДВ8010-Уф, ДА8010-Уф\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП4-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"21.07.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"20.07.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ЕВН/21-07-2022/188296137\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-189690896\",\n" +
                "\t\t\t\t\"org_title\":\"АО \\\"ПО ФИЗТЕХ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"60168-15\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры, вакуумметры, мановакуумметры, напоромеры, тягомеры и тягонапоромеры\",\n" +
                "\t\t\t\t\"mit_notation\":\"ФТ\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП4-Уф\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"26.09.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"25.09.2024\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ГГИ/26-09-2022/189690896\",\n" +
                "\t\t\t\t\"applicability\":true\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"vri_id\":\"1-191617859\",\n" +
                "\t\t\t\t\"org_title\":\"ООО \\\"ИНЭКС СЕРТ\\\"\",\n" +
                "\t\t\t\t\"mit_number\":\"10135-10\",\n" +
                "\t\t\t\t\"mit_title\":\"Манометры избыточного давления, вакуумметры и мановакуумметры показывающие\",\n" +
                "\t\t\t\t\"mit_notation\":\"МП-У, ВП-У и МВП-У\",\n" +
                "\t\t\t\t\"mi_modification\":\"МП4-УУ2\",\n" +
                "\t\t\t\t\"mi_number\":\"000257\",\n" +
                "\t\t\t\t\"verification_date\":\"28.09.2022\",\n" +
                "\t\t\t\t\"valid_date\":\"27.09.2023\",\n" +
                "\t\t\t\t\"result_docnum\":\"С-ДИЭ/28-09-2022/191617859\",\n" +
                "\t\t\t\"applicability\":true}\n" +
                "\t\t]\n" +
                "\t}}";

        HTTPGetter getter = new HTTPGetter();
        String searchString = "https://fgis.gost.ru/fundmetrology/eapi/vri/?year=2022&rows=100%20&search=005703";
        String searchString2 = "https://fgis.gost.ru/fundmetrology/eapi/vri/?year=2021&rows=100%20&search=W1-113-03359";
        List<Element> elements;
        try {
            elements = getter.sendGet("005703", "2021");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        elements.forEach(System.out::println);
    }
}
