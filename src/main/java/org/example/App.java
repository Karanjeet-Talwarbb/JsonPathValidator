package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ){
        String contextObj1="{\n" +
                "  \"input\": {\n" +
                "    \"create_fc_task\": {\n" +
                "      \"name\": \"$.bb2_onboarding.fc_name\",\n" +
                "      \"city_id\": \"$.bb2_onboarding.city_id\"\n" +
                "    },\n" +
                "    \"create_sa_task\": {\n" +
                "      \"name\": \"$.bb2_onboarding.sa_name\",\n" +
                "      \"city_id\": \"$.bb2_onboarding.city_id\",\n" +
                "      \"lmd_fc_id\": \"$.create_fc_task.id\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"output\": {\n" +
                "    \"bb2_onboarding\": {\n" +
                "      \"city_id\":1, \n" +
                "      \"fc_name\":\"fc\", \n" +
                "      \"sa_name\":\"sa\"\n" +
                "    },\n" +
                "  \"create_fc_task\": {\n" +
                "      \"id\": 2\n" +
                "    },\n" +
                "  \"create_fc_task\": {\n" +
                "      \"id\": 3\n" +
                "    }\n" +
                "  }\n" +
                "}";
        String contextObj2="{\n" +
                "\"input\":{\n" +
                "\"create_sa_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
                "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
                "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.path_type_name\",\n" +
                "      \"number_of_hops\":0\n" +
                "}\n" +
                "},\n" +
                "\"output\":{\n" +
                "\"fsd_onboarding\":{\n" +
                "\"created_by_id\":1,\n" +
                "\"sa_type_name\":\"sa_type_name\",\n" +
                "\"sa_type_slug\":\"sa_type_slug\",\n" +
                "\"path_type_name\":\"path_type_name\",\n" +
                "\"city_name\":\"city_name\",\n" +
                "\"src_fc_name\":\"src_fc_name\",\n" +
                "\"dest_fc_name\":\"dest_fc_name\",\n" +
                "\"hub_id\":\"hub_id\",\n" +
                "\"sa_name\":\"sa_name\",\n" +
                "\"dms\":[{\"name\":\"Bike\",\"cutoff\":\"today\",\"cutoff_day\":1}],\n" +
                "\"slot_definitions\":[{\"from_time\":\"from_time\",\"to_time\":\"to_time\",\"slug\":\"slug\", \"routing_start_time\": \"routing_start_time\",\"routing_end_time\":\"routing_end_time\"}],\n" +
                "\"template_name\":\"template_name\"\n" +
                "},\n" +
                "\"create_sa_type\":{\n" +
                "\"ids\":[1]\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"id\":[2]\n" +
                "}\n" +
                "}}";
        String contextObj3="{\n" +
                "\"input\":{\n" +
                "\"create_sa_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
                "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
                "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.path_type_name\",\n" +
                "      \"number_of_hops\":0\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"name\":\"$.fsd_onboarding.city_name\"\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "}\n" +
                "},\n" +
                "\"output\":{\n" +
                "\"fsd_onboarding\":{\n" +
                "\"created_by_id\":1,\n" +
                "\"sa_type_name\":\"sa_type_name\",\n" +
                "\"sa_type_slug\":\"sa_type_slug\",\n" +
                "\"path_type_name\":\"path_type_name\",\n" +
                "\"city_name\":\"city_name\",\n" +
                "\"src_fc_name\":\"src_fc_name\",\n" +
                "\"dest_fc_name\":\"dest_fc_name\",\n" +
                "\"hub_id\":\"hub_id\",\n" +
                "\"sa_name\":\"sa_name\",\n" +
                "\"dms\":[{\"name\":\"Bike\",\"cutoff\":\"today\",\"cutoff_day\":1}],\n" +
                "\"slot_definitions\":[{\"from_time\":\"from_time\",\"to_time\":\"to_time\",\"slug\":\"slug\", \"routing_start_time\": \"routing_start_time\",\"routing_end_time\":\"routing_end_time\"}],\n" +
                "\"template_name\":\"template_name\"\n" +
                "},\n" +
                "\"create_sa_type\":{\n" +
                "\"ids\":[1]\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"id\":[2]\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"id\":3\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"id\":4\n" +
                "}\n" +
                "}}";
        String contextObj4="{\n" +
                "\"input\":{\n" +
                "\"create_sa_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
                "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
                "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.path_type_name\",\n" +
                "      \"number_of_hops\":0\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"name\":\"$.fsd_onboarding.city_name\"\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_dest\":{\n" +
                "\"name\":\"$.fsd_onboarding.dest_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_company\":{\n" +
                "\"fc_id\":\"$.fsd_onboarding.path_type_name\"\n" +
                "},\"create_sa\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"city_id\":\"$.create_city.id\",\n" +
                "      \"lmd_fc_id\":\"$.create_fc_dest.id\"\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"hub_id\":\"$.fsd_onboarding.hub_id\",\n" +
                "      \"sa_id\":\"$.create_sa.id\"\n" +
                "}\n" +
                "},\n" +
                "\"output\":{\n" +
                "\"fsd_onboarding\":{\n" +
                "\"created_by_id\":1,\n" +
                "\"sa_type_name\":\"sa_type_name\",\n" +
                "\"sa_type_slug\":\"sa_type_slug\",\n" +
                "\"path_type_name\":\"path_type_name\",\n" +
                "\"city_name\":\"city_name\",\n" +
                "\"src_fc_name\":\"src_fc_name\",\n" +
                "\"dest_fc_name\":\"dest_fc_name\",\n" +
                "\"hub_id\":\"hub_id\",\n" +
                "\"sa_name\":\"sa_name\",\n" +
                "\"dms\":[{\"name\":\"Bike\",\"cutoff\":\"today\",\"cutoff_day\":1}],\n" +
                "\"slot_definitions\":[{\"from_time\":\"from_time\",\"to_time\":\"to_time\",\"slug\":\"slug\", \"routing_start_time\": \"routing_start_time\",\"routing_end_time\":\"routing_end_time\"}],\n" +
                "\"template_name\":\"template_name\"\n" +
                "},\n" +
                "\"create_sa_type\":{\n" +
                "\"ids\":[1]\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"id\":[2]\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"id\":3\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"id\":4\n" +
                "},\"create_fc_dest\":{\n" +
                "\"id\":5\n" +
                "},\"create_fc_company\":{\n" +
                "\"id\":6\n" +
                "},\"create_sa\":{\n" +
                "\"id\":7\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"id\":8\n" +
                "}\n" +
                "}}";
        String contextObject5="{\n" +
                "\"input\":{\n" +
                "\"create_sa_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
                "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
                "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.path_type_name\",\n" +
                "      \"number_of_hops\":0\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"name\":\"$.fsd_onboarding.city_name\"\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_dest\":{\n" +
                "\"name\":\"$.fsd_onboarding.dest_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_company\":{\n" +
                "\"fc_id\":\"$.fsd_onboarding.path_type_name\"\n" +
                "},\"create_sa\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"city_id\":\"$.create_city.id\",\n" +
                "      \"lmd_fc_id\":\"$.create_fc_dest.id\"\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"hub_id\":\"$.fsd_onboarding.hub_id\",\n" +
                "      \"sa_id\":\"$.create_sa.id\"\n" +
                "},\n" +
                "\"create_dms\":{\n" +
                "\"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
                "}\n" +
                "},\n" +
                "\"output\":{\n" +
                "\"fsd_onboarding\":{\n" +
                "\"created_by_id\":1,\n" +
                "\"sa_type_name\":\"sa_type_name\",\n" +
                "\"sa_type_slug\":\"sa_type_slug\",\n" +
                "\"path_type_name\":\"path_type_name\",\n" +
                "\"city_name\":\"city_name\",\n" +
                "\"src_fc_name\":\"src_fc_name\",\n" +
                "\"dest_fc_name\":\"dest_fc_name\",\n" +
                "\"hub_id\":\"hub_id\",\n" +
                "\"sa_name\":\"sa_name\",\n" +
                "\"dms\":[{\"name\":\"Bike\",\"cutoff\":\"today\",\"cutoff_day\":1}],\n" +
                "\"slot_definitions\":[{\"from_time\":\"from_time\",\"to_time\":\"to_time\",\"slug\":\"slug\", \"routing_start_time\": \"routing_start_time\",\"routing_end_time\":\"routing_end_time\"}],\n" +
                "\"template_name\":\"template_name\"\n" +
                "},\n" +
                "\"create_sa_type\":{\n" +
                "\"ids\":[1]\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"id\":[2]\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"id\":3\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"id\":4\n" +
                "},\"create_fc_dest\":{\n" +
                "\"id\":5\n" +
                "},\"create_fc_company\":{\n" +
                "\"id\":6\n" +
                "},\"create_sa\":{\n" +
                "\"id\":7\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"id\":8\n" +
                "},\n" +
                "\"create_dms\":{\n" +
                "\"dms\":[{\"name\":\"bike\",\"id\":9}]\n" +
                "}\n" +
                "}}";
        String contextObject6="{\n" +
                "\"input\":{\n" +
                "\"create_sa_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
                "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
                "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.path_type_name\",\n" +
                "      \"number_of_hops\":0\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"name\":\"$.fsd_onboarding.city_name\"\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_dest\":{\n" +
                "\"name\":\"$.fsd_onboarding.dest_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_company\":{\n" +
                "\"fc_id\":\"$.fsd_onboarding.path_type_name\"\n" +
                "},\"create_sa\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"city_id\":\"$.create_city.id\",\n" +
                "      \"lmd_fc_id\":\"$.create_fc_dest.id\"\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"hub_id\":\"$.fsd_onboarding.hub_id\",\n" +
                "      \"sa_id\":\"$.create_sa.id\"\n" +
                "},\n" +
                "\"create_dms\":{\n" +
                "\"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
                "},\n" +
                "\"create_sa_dm_mapping\":{\n" +
                "\"base_context\": \"$.create_dms[*]\",\n" +
                "\"sa_id\":\"$.create_sa.id\",\n" +
                "\"dm_id\":\"$.local_context.id\"\n" +
                "}\n" +
                "},\n" +
                "\"output\":{\n" +
                "\"fsd_onboarding\":{\n" +
                "\"created_by_id\":1,\n" +
                "\"sa_type_name\":\"sa_type_name\",\n" +
                "\"sa_type_slug\":\"sa_type_slug\",\n" +
                "\"path_type_name\":\"path_type_name\",\n" +
                "\"city_name\":\"city_name\",\n" +
                "\"src_fc_name\":\"src_fc_name\",\n" +
                "\"dest_fc_name\":\"dest_fc_name\",\n" +
                "\"hub_id\":\"hub_id\",\n" +
                "\"sa_name\":\"sa_name\",\n" +
                "\"dms\":[{\"name\":\"Bike\",\"cutoff\":\"today\",\"cutoff_day\":1}],\n" +
                "\"slot_definitions\":[{\"from_time\":\"from_time\",\"to_time\":\"to_time\",\"slug\":\"slug\", \"routing_start_time\": \"routing_start_time\",\"routing_end_time\":\"routing_end_time\"}],\n" +
                "\"template_name\":\"template_name\"\n" +
                "},\n" +
                "\"create_sa_type\":[1],\n" +
                "\"create_path_type\":{\n" +
                "\"id\":[2]\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"id\":3\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"id\":4\n" +
                "},\"create_fc_dest\":{\n" +
                "\"id\":5\n" +
                "},\"create_fc_company\":{\n" +
                "\"id\":6\n" +
                "},\"create_sa\":{\n" +
                "\"id\":7\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"id\":8\n" +
                "},\n" +
                "\"create_dms\":[{\"name\":\"bike\",\"id\":9}],\n" +
                "\"create_sa_dm_mapping\":{\"id\":10}\n" +
                "}}";
        String contextObject7="{\n" +
                "\"input\":{\n" +
                "\"create_sa_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
                "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
                "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.path_type_name\",\n" +
                "      \"number_of_hops\":0\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"name\":\"$.fsd_onboarding.city_name\"\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_dest\":{\n" +
                "\"name\":\"$.fsd_onboarding.dest_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_company\":{\n" +
                "\"fc_id\":\"$.fsd_onboarding.path_type_name\"\n" +
                "},\"create_sa\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"city_id\":\"$.create_city.id\",\n" +
                "      \"lmd_fc_id\":\"$.create_fc_dest.id\"\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"hub_id\":\"$.fsd_onboarding.hub_id\",\n" +
                "      \"sa_id\":\"$.create_sa.id\"\n" +
                "},\n" +
                "\"create_dms\":{\n" +
                "\"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
                "},\n" +
                "\"create_sa_dm_mapping\":{\n" +
                "\"base_context\": \"$.create_dms[*]\",\n" +
                "\"sa_id\":\"$.create_sa.id\",\n" +
                "\"dm_id\":\"$.local_context.id\"\n" +
                "},\n" +
                "\"create_path\":{\n" +
                "\"src_fc\":\"$.create_fc_src.id\",\n" +
                "      \"dest_fc\":\"$.create_fc_dest.id\"\n" +
                "\t  },\n" +
                "\"upload_jsom\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"servcieability_area_id\":\"$.create_sa.id\",\n" +
                "      \"geo_json\":\"{\\\"type\\\":\\\"Polygon\\\",\\\"coordinates\\\":[ [ [ 85.2978515625, 22.258596740975719 ], [ 85.25390625, 21.637005211106302 ] ] ] }\"\n" +
                "},\n" +
                "\"create_sa_group_type\":{\n" +
                "\"sa_group_type\":\"$.fsd_onboarding.sa_group_type\",\n" +
                "      \"is_active\":true\n" +
                "},\n" +
                "\"create_sa_group\":{\n" +
                "\"sa_group_type\":\"$.create_sa_group_type.id\",\n" +
                "      \"name\":\"$.fsd_onboarding.sa_group_name\"\n" +
                "}\n" +
                "},\n" +
                "\"output\":{\n" +
                "\"fsd_onboarding\":{\n" +
                "\"created_by_id\":1,\n" +
                "\"sa_type_name\":\"sa_type_name\",\n" +
                "\"sa_type_slug\":\"sa_type_slug\",\n" +
                "\"path_type_name\":\"path_type_name\",\n" +
                "\"city_name\":\"city_name\",\n" +
                "\"src_fc_name\":\"src_fc_name\",\n" +
                "\"dest_fc_name\":\"dest_fc_name\",\n" +
                "\"hub_id\":\"hub_id\",\n" +
                "\"sa_name\":\"sa_name\",\n" +
                "\"dms\":[{\"name\":\"Bike\",\"cutoff\":\"today\",\"cutoff_day\":1}],\n" +
                "\"sa_group_type\":\"sa_group_type\",\n" +
                "\"sa_group_name\":\"sa_group_name\",\n" +
                "\"slot_definitions\":[{\"from_time\":\"from_time\",\"to_time\":\"to_time\",\"slug\":\"slug\", \"routing_start_time\": \"routing_start_time\",\"routing_end_time\":\"routing_end_time\"}],\n" +
                "\"template_name\":\"template_name\"\n" +
                "},\n" +
                "\"create_sa_type\":[1],\n" +
                "\"create_path_type\":{\n" +
                "\"id\":[2]\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"id\":3\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"id\":4\n" +
                "},\"create_fc_dest\":{\n" +
                "\"id\":5\n" +
                "},\"create_fc_company\":{\n" +
                "\"id\":6\n" +
                "},\"create_sa\":{\n" +
                "\"id\":7\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"id\":8\n" +
                "},\n" +
                "\"create_dms\":[{\"name\":\"bike\",\"id\":9}],\n" +
                "\"create_sa_dm_mapping\":{\"id\":10},\n" +
                "\"create_path\":{\n" +
                "\"id\":11},\n" +
                "\"upload_jsom\":{\n" +
                "\"id\":12},\n" +
                "\"create_sa_group_type\":{\n" +
                "\"id\":13\n" +
                "},\n" +
                "\"create_sa_group\":{\n" +
                "\"id\":14\n" +
                "}\n" +
                "}}";
        String contextObject8="{\n" +
                "\"input\":{\n" +
                "\"create_sa_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
                "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
                "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.path_type_name\",\n" +
                "      \"number_of_hops\":0\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"name\":\"$.fsd_onboarding.city_name\"\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_dest\":{\n" +
                "\"name\":\"$.fsd_onboarding.dest_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_company\":{\n" +
                "\"fc_id\":\"$.fsd_onboarding.path_type_name\"\n" +
                "},\"create_sa\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"city_id\":\"$.create_city.id\",\n" +
                "      \"lmd_fc_id\":\"$.create_fc_dest.id\"\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"hub_id\":\"$.fsd_onboarding.hub_id\",\n" +
                "      \"sa_id\":\"$.create_sa.id\"\n" +
                "},\n" +
                "\"create_dms\":{\n" +
                "\"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
                "},\n" +
                "\"create_sa_dm_mapping\":{\n" +
                "\"base_context\": \"$.create_dms[*]\",\n" +
                "\"sa_id\":\"$.create_sa.id\",\n" +
                "\"dm_id\":\"$.local_context.id\"\n" +
                "},\n" +
                "\"create_path\":{\n" +
                "\"src_fc\":\"$.create_fc_src.id\",\n" +
                "      \"dest_fc\":\"$.create_fc_dest.id\"\n" +
                "\t  },\n" +
                "\"upload_jsom\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"servcieability_area_id\":\"$.create_sa.id\",\n" +
                "      \"geo_json\":\"{\\\"type\\\":\\\"Polygon\\\",\\\"coordinates\\\":[ [ [ 85.2978515625, 22.258596740975719 ], [ 85.25390625, 21.637005211106302 ] ] ] }\"\n" +
                "},\n" +
                "\"create_sa_group_type\":{\n" +
                "\"sa_group_type\":\"$.fsd_onboarding.sa_group_type\",\n" +
                "      \"is_active\":true\n" +
                "},\n" +
                "\"create_sa_group\":{\n" +
                "\"sa_group_type\":\"$.create_sa_group_type.id\",\n" +
                "      \"name\":\"$.fsd_onboarding.sa_group_name\"\n" +
                "},\n" +
                "\"create_slot_definitions\":{\n" +
                "      \"base_context\": \"$.fsd_onboarding.slot_definitions[*]\",\n" +
                "\t  \"from_time\":\"$.local_context.from_time\",\n" +
                "          \"to_time\":\"$.local_context.to_time\",\n" +
                "          \"slug\":\"$.local_context.slug\"\n" +
                "}\n" +
                "},\n" +
                "\"output\":{\n" +
                "\"fsd_onboarding\":{\n" +
                "\"created_by_id\":1,\n" +
                "\"sa_type_name\":\"sa_type_name\",\n" +
                "\"sa_type_slug\":\"sa_type_slug\",\n" +
                "\"path_type_name\":\"path_type_name\",\n" +
                "\"city_name\":\"city_name\",\n" +
                "\"src_fc_name\":\"src_fc_name\",\n" +
                "\"dest_fc_name\":\"dest_fc_name\",\n" +
                "\"hub_id\":\"hub_id\",\n" +
                "\"sa_name\":\"sa_name\",\n" +
                "\"dms\":[{\"name\":\"Bike\",\"cutoff\":\"today\",\"cutoff_day\":1}],\n" +
                "\"sa_group_type\":\"sa_group_type\",\n" +
                "\"sa_group_name\":\"sa_group_name\",\n" +
                "\"slot_definitions\":[{\"from_time\":\"from_time\",\"to_time\":\"to_time\",\"slug\":\"slug\", \"routing_start_time\": \"routing_start_time\",\"routing_end_time\":\"routing_end_time\"}],\n" +
                "\"template_name\":\"template_name\"\n" +
                "},\n" +
                "\"create_sa_type\":[1],\n" +
                "\"create_path_type\":{\n" +
                "\"id\":[2]\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"id\":3\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"id\":4\n" +
                "},\"create_fc_dest\":{\n" +
                "\"id\":5\n" +
                "},\"create_fc_company\":{\n" +
                "\"id\":6\n" +
                "},\"create_sa\":{\n" +
                "\"id\":7\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"id\":8\n" +
                "},\n" +
                "\"create_dms\":[{\"name\":\"bike\",\"id\":9}],\n" +
                "\"create_sa_dm_mapping\":{\"id\":10},\n" +
                "\"create_path\":{\n" +
                "\"id\":11},\n" +
                "\"upload_jsom\":{\n" +
                "\"id\":12},\n" +
                "\"create_sa_group_type\":{\n" +
                "\"id\":13\n" +
                "},\n" +
                "\"create_sa_group\":{\n" +
                "\"id\":14\n" +
                "},\n" +
                "\"create_slot_definitions\":[{\"id\":15,\"slug\":\"sdSlug\"}]\n" +
                "}}";
        String contextObject9="{\n" +
                "\"input\":{\n" +
                "\"create_sa_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
                "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
                "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.path_type_name\",\n" +
                "      \"number_of_hops\":0\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"name\":\"$.fsd_onboarding.city_name\"\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_dest\":{\n" +
                "\"name\":\"$.fsd_onboarding.dest_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_company\":{\n" +
                "\"fc_id\":\"$.fsd_onboarding.path_type_name\"\n" +
                "},\"create_sa\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"city_id\":\"$.create_city.id\",\n" +
                "      \"lmd_fc_id\":\"$.create_fc_dest.id\"\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"hub_id\":\"$.fsd_onboarding.hub_id\",\n" +
                "      \"sa_id\":\"$.create_sa.id\"\n" +
                "},\n" +
                "\"create_dms\":{\n" +
                "\"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
                "},\n" +
                "\"create_sa_dm_mapping\":{\n" +
                "\"base_context\": \"$.create_dms[*]\",\n" +
                "\"sa_id\":\"$.create_sa.id\",\n" +
                "\"dm_id\":\"$.local_context.id\"\n" +
                "},\n" +
                "\"create_path\":{\n" +
                "\"src_fc\":\"$.create_fc_src.id\",\n" +
                "      \"dest_fc\":\"$.create_fc_dest.id\"\n" +
                "\t  },\n" +
                "\"upload_jsom\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"servcieability_area_id\":\"$.create_sa.id\",\n" +
                "      \"geo_json\":\"{\\\"type\\\":\\\"Polygon\\\",\\\"coordinates\\\":[ [ [ 85.2978515625, 22.258596740975719 ], [ 85.25390625, 21.637005211106302 ] ] ] }\"\n" +
                "},\n" +
                "\"create_sa_group_type\":{\n" +
                "\"sa_group_type\":\"$.fsd_onboarding.sa_group_type\",\n" +
                "      \"is_active\":true\n" +
                "},\n" +
                "\"create_sa_group\":{\n" +
                "\"sa_group_type\":\"$.create_sa_group_type.id\",\n" +
                "      \"name\":\"$.fsd_onboarding.sa_group_name\"\n" +
                "},\n" +
                "\"create_slot_definitions\":{\n" +
                "      \"base_context\": \"$.fsd_onboarding.slot_definitions[*]\",\n" +
                "\t  \"from_time\":\"$.local_context.from_time\",\n" +
                "          \"to_time\":\"$.local_context.to_time\",\n" +
                "          \"slug\":\"$.local_context.slug\"\n" +
                "},\n" +
                "\"create_template\":{\n" +
                "\"name\":\"$.fsd_onboarding.template_name\",\n" +
                "      \"is_active\":true\n" +
                "},\n" +
                "\"create_template_slot\":{\n" +
                " \"base_context\": \"$.create_slot_definitions[*]\",\n" +
                " \"template_id\":\"$.create_template.id\",\n" +
                "        \"slot_definition_id\":\"$.local_context.id\"\n" +
                " }\n" +
                "},\n" +
                "\"output\":{\n" +
                "\"fsd_onboarding\":{\n" +
                "\"created_by_id\":1,\n" +
                "\"sa_type_name\":\"sa_type_name\",\n" +
                "\"sa_type_slug\":\"sa_type_slug\",\n" +
                "\"path_type_name\":\"path_type_name\",\n" +
                "\"city_name\":\"city_name\",\n" +
                "\"src_fc_name\":\"src_fc_name\",\n" +
                "\"dest_fc_name\":\"dest_fc_name\",\n" +
                "\"hub_id\":\"hub_id\",\n" +
                "\"sa_name\":\"sa_name\",\n" +
                "\"dms\":[{\"name\":\"Bike\",\"cutoff\":\"today\",\"cutoff_day\":1}],\n" +
                "\"sa_group_type\":\"sa_group_type\",\n" +
                "\"sa_group_name\":\"sa_group_name\",\n" +
                "\"slot_definitions\":[{\"from_time\":\"from_time\",\"to_time\":\"to_time\",\"slug\":\"slug\", \"routing_start_time\": \"routing_start_time\",\"routing_end_time\":\"routing_end_time\"}],\n" +
                "\"template_name\":\"template_name\"\n" +
                "},\n" +
                "\"create_sa_type\":[1],\n" +
                "\"create_path_type\":{\n" +
                "\"id\":[2]\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"id\":3\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"id\":4\n" +
                "},\"create_fc_dest\":{\n" +
                "\"id\":5\n" +
                "},\"create_fc_company\":{\n" +
                "\"id\":6\n" +
                "},\"create_sa\":{\n" +
                "\"id\":7\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"id\":8\n" +
                "},\n" +
                "\"create_dms\":[{\"name\":\"bike\",\"id\":9}],\n" +
                "\"create_sa_dm_mapping\":{\"id\":10},\n" +
                "\"create_path\":{\n" +
                "\"id\":11},\n" +
                "\"upload_jsom\":{\n" +
                "\"id\":12},\n" +
                "\"create_sa_group_type\":{\n" +
                "\"id\":13\n" +
                "},\n" +
                "\"create_sa_group\":{\n" +
                "\"id\":14\n" +
                "},\n" +
                "\"create_slot_definitions\":[{\"id\":15,\"slug\":\"sdSlug\"}],\n" +
                "\"create_template\":{\n" +
                "\"id\":16},\n" +
                "\"create_template_slot\":[{\"id\":16,\"slot_definition_id\":17,\"template_slot_id\":18}]\n" +
                "}}";
        String contextObject10="{\n" +
                "\"input\":{\n" +
                "\"create_sa_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
                "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
                "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
                "},\n" +
                "\"create_path_type\":{\n" +
                "\"name\":\"$.fsd_onboarding.path_type_name\",\n" +
                "      \"number_of_hops\":0\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"name\":\"$.fsd_onboarding.city_name\"\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_dest\":{\n" +
                "\"name\":\"$.fsd_onboarding.dest_fc_name\",\n" +
                "      \"city_id\":\"$.create_city.id\"\n" +
                "},\n" +
                "\"create_fc_company\":{\n" +
                "\"fc_id\":\"$.fsd_onboarding.path_type_name\"\n" +
                "},\"create_sa\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"city_id\":\"$.create_city.id\",\n" +
                "      \"lmd_fc_id\":\"$.create_fc_dest.id\"\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"hub_id\":\"$.fsd_onboarding.hub_id\",\n" +
                "      \"sa_id\":\"$.create_sa.id\"\n" +
                "},\n" +
                "\"create_dms\":{\n" +
                "\"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
                "},\n" +
                "\"create_sa_dm_mapping\":{\n" +
                "\"base_context\": \"$.create_dms[*]\",\n" +
                "\"sa_id\":\"$.create_sa.id\",\n" +
                "\"dm_id\":\"$.local_context.id\"\n" +
                "},\n" +
                "\"create_path\":{\n" +
                "\"src_fc\":\"$.create_fc_src.id\",\n" +
                "      \"dest_fc\":\"$.create_fc_dest.id\"\n" +
                "\t  },\n" +
                "\"upload_jsom\":{\n" +
                "\"name\":\"$.fsd_onboarding.sa_name\",\n" +
                "      \"servcieability_area_id\":\"$.create_sa.id\",\n" +
                "      \"geo_json\":\"{\\\"type\\\":\\\"Polygon\\\",\\\"coordinates\\\":[ [ [ 85.2978515625, 22.258596740975719 ], [ 85.25390625, 21.637005211106302 ] ] ] }\"\n" +
                "},\n" +
                "\"create_sa_group_type\":{\n" +
                "\"sa_group_type\":\"$.fsd_onboarding.sa_group_type\",\n" +
                "      \"is_active\":true\n" +
                "},\n" +
                "\"create_sa_group\":{\n" +
                "\"sa_group_type\":\"$.create_sa_group_type.id\",\n" +
                "      \"name\":\"$.fsd_onboarding.sa_group_name\"\n" +
                "},\n" +
                "\"create_slot_definitions\":{\n" +
                "      \"base_context\": \"$.fsd_onboarding.slot_definitions[*]\",\n" +
                "\t  \"from_time\":\"$.local_context.from_time\",\n" +
                "          \"to_time\":\"$.local_context.to_time\",\n" +
                "          \"slug\":\"$.local_context.slug\"\n" +
                "},\n" +
                "\"create_template\":{\n" +
                "\"name\":\"$.fsd_onboarding.template_name\",\n" +
                "      \"is_active\":true\n" +
                "},\n" +
                "\"create_template_slot\":{\n" +
                " \"base_context\": \"$.create_slot_definitions[*]\",\n" +
                " \"template_id\":\"$.create_template.id\",\n" +
                "        \"slot_definition_id\":\"$.local_context.id\"\n" +
                " },\n" +
                " \"create_sa_dm_cutoff\":{\n" +
                " \"sa_id\": \"$.create_sa.id\",\n" +
                "      \"dm_id\": \"$.local_context.id\", \n" +
                "      \"cutoff\": '$.fsd_onboarding.dms[?(@name==\"$.local_context.name\")].cutoff',\n" +
                "      \"cutoff_day\": '$.fsd_onboarding.dms[?(@name==\"$.local_context.name\")].cutoff_day'\n" +
                "\t  }\n" +
                "},\n" +
                "\"output\":{\n" +
                "\"fsd_onboarding\":{\n" +
                "\"created_by_id\":1,\n" +
                "\"sa_type_name\":\"sa_type_name\",\n" +
                "\"sa_type_slug\":\"sa_type_slug\",\n" +
                "\"path_type_name\":\"path_type_name\",\n" +
                "\"city_name\":\"city_name\",\n" +
                "\"src_fc_name\":\"src_fc_name\",\n" +
                "\"dest_fc_name\":\"dest_fc_name\",\n" +
                "\"hub_id\":\"hub_id\",\n" +
                "\"sa_name\":\"sa_name\",\n" +
                "\"dms\":[{\"name\":\"Bike\",\"cutoff\":\"today\",\"cutoff_day\":1}],\n" +
                "\"sa_group_type\":\"sa_group_type\",\n" +
                "\"sa_group_name\":\"sa_group_name\",\n" +
                "\"slot_definitions\":[{\"from_time\":\"from_time\",\"to_time\":\"to_time\",\"slug\":\"slug\", \"routing_start_time\": \"routing_start_time\",\"routing_end_time\":\"routing_end_time\"}],\n" +
                "\"template_name\":\"template_name\"\n" +
                "},\n" +
                "\"create_sa_type\":[1],\n" +
                "\"create_path_type\":{\n" +
                "\"id\":[2]\n" +
                "},\n" +
                "\"create_city\":{\n" +
                "\"id\":3\n" +
                "},\n" +
                "\"create_fc_src\":{\n" +
                "\"id\":4\n" +
                "},\"create_fc_dest\":{\n" +
                "\"id\":5\n" +
                "},\"create_fc_company\":{\n" +
                "\"id\":6\n" +
                "},\"create_sa\":{\n" +
                "\"id\":7\n" +
                "},\n" +
                "\"hub_sa_mapping\":{\n" +
                "\"id\":8\n" +
                "},\n" +
                "\"create_dms\":[{\"name\":\"bike\",\"id\":9}],\n" +
                "\"create_sa_dm_mapping\":{\"id\":10},\n" +
                "\"create_path\":{\n" +
                "\"id\":11},\n" +
                "\"upload_jsom\":{\n" +
                "\"id\":12},\n" +
                "\"create_sa_group_type\":{\n" +
                "\"id\":13\n" +
                "},\n" +
                "\"create_sa_group\":{\n" +
                "\"id\":14\n" +
                "},\n" +
                "\"create_slot_definitions\":[{\"id\":15,\"slug\":\"sdSlug\"}],\n" +
                "\"create_template\":{\n" +
                "\"id\":16},\n" +
                "\"create_template_slot\":[{\"id\":16,\"slot_definition_id\":17,\"template_slot_id\":18}],\n" +
                "\"create_sa_dm_cutoff\":{\"id\":17}\n" +
                "}}";

      // System.out.println(job.getDelegate());
       String prepTest1="{\"create_fc_src \":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "}\n" +
               "}";
       String prepTest2="{\"create_fc_src \":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_dms\":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"type\":\"array\",\n" +
               "         \"items\":{\n" +
               "            \"type\":\"object\",\n" +
               "            \"properties\":{\n" +
               "               \"name\":{\n" +
               "                  \"type\":\"string\"\n" +
               "               },\n" +
               "               \"id\":{\n" +
               "                  \"type\":\"integer\"\n" +
               "               }\n" +
               "            }\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "}\n" +
               "}";
       String prepTest3="{\"create_fc_src \":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_dms\":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"type\":\"array\",\n" +
               "         \"items\":{\n" +
               "            \"type\":\"object\",\n" +
               "            \"properties\":{\n" +
               "               \"name\":{\n" +
               "                  \"type\":\"string\"\n" +
               "               },\n" +
               "               \"id\":{\n" +
               "                  \"type\":\"integer\"\n" +
               "               }\n" +
               "            }\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_template_slot\":\n" +
               "{\n" +
               "   \"bulk_input\": {\n" +
               "      \"base_context\": \"$.create_slot_definitions[*]\",\n" +
               "      \"transformation\": {\n" +
               "          \"slot_definition_id\":\"$.local_context.id\"\n" +
               "      }\n" +
               "   },\n" +
               "   \"input_format\": [\n" +
               "      {\n" +
               "        \"template_id\":\"$.create_template.id\",\n" +
               "        \"slot_definition_id\":\"$.local_context.id\"\n" +
               "      }\n" +
               "   ],\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "        \"type\":\"array\",\n" +
               "          \"items\":{\n" +
               "              \"type\":\"object\",\n" +
               "              \"id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              },\n" +
               "              \"template_slot_id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              },\n" +
               "              \"slot_definition_id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              }\n" +
               "          }\n" +
               "      }\n" +
               "   }\n" +
               "}\n" +
               "}\n";
       String fullTest1="{\n" +
               "\"fsd_onboarding\":\n" +
               "{\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"created_by_id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         },\n" +
               "         \"sa_type_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"sa_type_slug\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"path_type_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"city_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"src_fc_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"dest_fc_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"hub_id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         },\n" +
               "         \"sa_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"dms\":{\n" +
               "            \"properties\":{\n" +
               "               \"type\":\"array\",\n" +
               "               \"items\":{\n" +
               "                  \"type\":\"object\",\n" +
               "                  \"properties\": {\n" +
               "                      \"name\": {\n" +
               "                          \"type\": \"string\"\n" +
               "                      },\n" +
               "                      \"cutoff\": {\n" +
               "                          \"type\": \"string\"\n" +
               "                      },\n" +
               "                      \"cutoff_day\": {\n" +
               "                          \"type\": \"number\"\n" +
               "                      }\n" +
               "                  }\n" +
               "               }\n" +
               "            }\n" +
               "         },\n" +
               "         \"sa_group_type\": {\n" +
               "            \"type\":\"string\"\n" +
               "         }\n" +
               "         \"sa_group_name\": {\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"slot_definitions\": {\n" +
               "            \"type\": \"array\",\n" +
               "            \"items\": {\n" +
               "              \"type\": \"object\",\n" +
               "              \"properties\": {\n" +
               "                \"from_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"to_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"slug\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"routing_start_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"routing_end_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                }\n" +
               "              }\n" +
               "            }\n" +
               "         },\n" +
               "         \"template_name\": {\n" +
               "            \"type\": \"string\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_fc_src \":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_dms\":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"type\":\"array\",\n" +
               "         \"items\":{\n" +
               "            \"type\":\"object\",\n" +
               "            \"properties\":{\n" +
               "               \"name\":{\n" +
               "                  \"type\":\"string\"\n" +
               "               },\n" +
               "               \"id\":{\n" +
               "                  \"type\":\"integer\"\n" +
               "               }\n" +
               "            }\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_template_slot\":\n" +
               "{\n" +
               "   \"bulk_input\": {\n" +
               "      \"base_context\": \"$.create_slot_definitions[*]\",\n" +
               "      \"transformation\": {\n" +
               "          \"slot_definition_id\":\"$.local_context.id\"\n" +
               "      }\n" +
               "   },\n" +
               "   \"input_format\": [\n" +
               "      {\n" +
               "        \"template_id\":\"$.create_template.id\",\n" +
               "        \"slot_definition_id\":\"$.local_context.id\"\n" +
               "      }\n" +
               "   ],\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "        \"type\":\"array\",\n" +
               "          \"items\":{\n" +
               "              \"type\":\"object\",\n" +
               "\t\t\t  \"properties\":{\n" +
               "              \"id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              },\n" +
               "              \"template_slot_id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              },\n" +
               "              \"slot_definition_id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              }\n" +
               "\t\t\t  }\n" +
               "          }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_sa_dm_mapping\":\n" +
               "{\n" +
               "   \"repeatable\": {\n" +
               "      \"base_context\": \"$.create_dms[*]\",\n" +
               "      \"transformation\": {\n" +
               "          \"dm_id\": \"$.local_context.id\"\n" +
               "      }\n" +
               "   },\n" +
               "   \"input_format\":{\n" +
               "      \"sa_id\":\"$.create_sa.id\",\n" +
               "      \"dm_id\":\"$.local_context.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_sa_type\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
               "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
               "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"type\":\"array\",\n" +
               "         \"items\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_path_type\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.path_type_name\",\n" +
               "      \"number_of_hops\":0\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_city\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.city_name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_fc_src\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_fc_dest\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.dest_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_fc_company\":{\n" +
               "   \"input_format\":{\n" +
               "      \"fc_id\":\"$.fsd_onboarding.path_type_name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_sa\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.sa_name\",\n" +
               "      \"city_id\":\"$.create_city.id\",\n" +
               "      \"lmd_fc_id\":\"$.create_fc_dest.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "}\n" +
               "}\n";
       String fullTest2="{\n" +
               "\"create_fc_src \":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_dms\":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"type\":\"array\",\n" +
               "         \"items\":{\n" +
               "            \"type\":\"object\",\n" +
               "            \"properties\":{\n" +
               "               \"name\":{\n" +
               "                  \"type\":\"string\"\n" +
               "               },\n" +
               "               \"id\":{\n" +
               "                  \"type\":\"integer\"\n" +
               "               }\n" +
               "            }\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_template_slot\":\n" +
               "{\n" +
               "   \"bulk_input\": {\n" +
               "      \"base_context\": \"$.create_slot_definitions[*]\",\n" +
               "      \"transformation\": {\n" +
               "          \"slot_definition_id\":\"$.local_context.id\"\n" +
               "      }\n" +
               "   },\n" +
               "   \"input_format\": [\n" +
               "      {\n" +
               "        \"template_id\":\"$.create_template.id\",\n" +
               "        \"slot_definition_id\":\"$.local_context.id\"\n" +
               "      }\n" +
               "   ],\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "        \"type\":\"array\",\n" +
               "          \"items\":{\n" +
               "              \"type\":\"object\",\n" +
               "\t\t\t  \"properties\":{\n" +
               "              \"id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              },\n" +
               "              \"template_slot_id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              },\n" +
               "              \"slot_definition_id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              }\n" +
               "\t\t\t  }\n" +
               "          }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_sa_dm_mapping\":\n" +
               "{\n" +
               "   \"repeatable\": {\n" +
               "      \"base_context\": \"$.create_dms[*]\",\n" +
               "      \"transformation\": {\n" +
               "          \"dm_id\": \"$.local_context.id\"\n" +
               "      }\n" +
               "   },\n" +
               "   \"input_format\":{\n" +
               "      \"sa_id\":\"$.create_sa.id\",\n" +
               "      \"dm_id\":\"$.local_context.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_sa_type\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
               "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
               "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"type\":\"array\",\n" +
               "         \"items\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_path_type\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.path_type_name\",\n" +
               "      \"number_of_hops\":0\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_city\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.city_name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_fc_src\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_fc_dest\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.dest_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_fc_company\":{\n" +
               "   \"input_format\":{\n" +
               "      \"fc_id\":\"$.fsd_onboarding.path_type_name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_sa\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.sa_name\",\n" +
               "      \"city_id\":\"$.create_city.id\",\n" +
               "      \"lmd_fc_id\":\"$.create_fc_dest.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"fsd_onboarding\":\n" +
               "{\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"created_by_id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         },\n" +
               "         \"sa_type_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"sa_type_slug\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"path_type_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"city_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"src_fc_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"dest_fc_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"hub_id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         },\n" +
               "         \"sa_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"dms\":{\n" +
               "            \"properties\":{\n" +
               "               \"type\":\"array\",\n" +
               "               \"items\":{\n" +
               "                  \"type\":\"object\",\n" +
               "                  \"properties\": {\n" +
               "                      \"name\": {\n" +
               "                          \"type\": \"string\"\n" +
               "                      },\n" +
               "                      \"cutoff\": {\n" +
               "                          \"type\": \"string\"\n" +
               "                      },\n" +
               "                      \"cutoff_day\": {\n" +
               "                          \"type\": \"number\"\n" +
               "                      }\n" +
               "                  }\n" +
               "               }\n" +
               "            }\n" +
               "         },\n" +
               "         \"sa_group_type\": {\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"sa_group_name\": {\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"slot_definitions\": {\n" +
               "            \"type\": \"array\",\n" +
               "            \"items\": {\n" +
               "              \"type\": \"object\",\n" +
               "              \"properties\": {\n" +
               "                \"from_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"to_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"slug\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"routing_start_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"routing_end_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                }\n" +
               "              }\n" +
               "            }\n" +
               "         },\n" +
               "         \"template_name\": {\n" +
               "            \"type\": \"string\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "}\n" +
               "}\n";
       String fullTest3="{\n" +
               "\"create_fc_src \":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_dms\":\n" +
               "{\n" +
               "   \"input_format\":{\n" +
               "      \"names\":\"$.fsd_onboarding.dms[*].name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"type\":\"array\",\n" +
               "         \"items\":{\n" +
               "            \"type\":\"object\",\n" +
               "            \"properties\":{\n" +
               "               \"name\":{\n" +
               "                  \"type\":\"string\"\n" +
               "               },\n" +
               "               \"id\":{\n" +
               "                  \"type\":\"integer\"\n" +
               "               }\n" +
               "            }\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_template_slot\":\n" +
               "{\n" +
               "   \"bulk_input\": {\n" +
               "      \"base_context\": \"$.create_slot_definitions[*]\",\n" +
               "      \"transformation\": {\n" +
               "          \"slot_definition_id\":\"$.local_context.id\"\n" +
               "      }\n" +
               "   },\n" +
               "   \"input_format\": [\n" +
               "      {\n" +
               "        \"template_id\":\"$.create_template.id\",\n" +
               "        \"slot_definition_id\":\"$.local_context.id\"\n" +
               "      }\n" +
               "   ],\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "        \"type\":\"array\",\n" +
               "          \"items\":{\n" +
               "              \"type\":\"object\",\n" +
               "\t\t\t  \"properties\":{\n" +
               "              \"id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              },\n" +
               "              \"template_slot_id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              },\n" +
               "              \"slot_definition_id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              }\n" +
               "\t\t\t  }\n" +
               "          }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_sa_dm_mapping\":\n" +
               "{\n" +
               "   \"repeatable\": {\n" +
               "      \"base_context\": \"$.create_dms[*]\",\n" +
               "      \"transformation\": {\n" +
               "          \"dm_id\": \"$.local_context.id\"\n" +
               "      }\n" +
               "   },\n" +
               "   \"input_format\":{\n" +
               "      \"sa_id\":\"$.create_sa.id\",\n" +
               "      \"dm_id\":\"$.local_context.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_sa_type\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.sa_type_name\",\n" +
               "      \"slug\":\"$.fsd_onboarding.sa_type_slug\",\n" +
               "      \"created_by_id\":\"$.fsd_onboarding.created_by_id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"type\":\"array\",\n" +
               "         \"items\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_path_type\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.path_type_name\",\n" +
               "      \"number_of_hops\":0\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_city\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.city_name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_fc_src\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.src_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_fc_dest\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.dest_fc_name\",\n" +
               "      \"city_id\":\"$.create_city.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_fc_company\":{\n" +
               "   \"input_format\":{\n" +
               "      \"fc_id\":\"$.fsd_onboarding.path_type_name\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_sa\":{\n" +
               "   \"input_format\":{\n" +
               "      \"name\":\"$.fsd_onboarding.sa_name\",\n" +
               "      \"city_id\":\"$.create_city.id\",\n" +
               "      \"lmd_fc_id\":\"$.create_fc_dest.id\"\n" +
               "   },\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"fsd_onboarding\":\n" +
               "{\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "         \"created_by_id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         },\n" +
               "         \"sa_type_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"sa_type_slug\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"path_type_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"city_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"src_fc_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"dest_fc_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"hub_id\":{\n" +
               "            \"type\":\"number\"\n" +
               "         },\n" +
               "         \"sa_name\":{\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"dms\":{\n" +
               "            \"properties\":{\n" +
               "               \"type\":\"array\",\n" +
               "               \"items\":{\n" +
               "                  \"type\":\"object\",\n" +
               "                  \"properties\": {\n" +
               "                      \"name\": {\n" +
               "                          \"type\": \"string\"\n" +
               "                      },\n" +
               "                      \"cutoff\": {\n" +
               "                          \"type\": \"string\"\n" +
               "                      },\n" +
               "                      \"cutoff_day\": {\n" +
               "                          \"type\": \"number\"\n" +
               "                      }\n" +
               "                  }\n" +
               "               }\n" +
               "            }\n" +
               "         },\n" +
               "         \"sa_group_type\": {\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"sa_group_name\": {\n" +
               "            \"type\":\"string\"\n" +
               "         },\n" +
               "         \"slot_definitions\": {\n" +
               "            \"type\": \"array\",\n" +
               "            \"items\": {\n" +
               "              \"type\": \"object\",\n" +
               "              \"properties\": {\n" +
               "                \"from_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"to_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"slug\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"routing_start_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                },\n" +
               "                \"routing_end_time\": {\n" +
               "                  \"type\": \"string\"\n" +
               "                }\n" +
               "              }\n" +
               "            }\n" +
               "         },\n" +
               "         \"template_name\": {\n" +
               "            \"type\": \"string\"\n" +
               "         }\n" +
               "      }\n" +
               "   }\n" +
               "},\n" +
               "\"create_slot_definitions\":{\n" +
               "   \"bulk_input\": {\n" +
               "      \"base_context\": \"$.fsd_onboarding.slot_definitions[*]\",\n" +
               "      \"transformation\": {\n" +
               "          \"from_time\":\"$.local_context.from_time\",\n" +
               "          \"to_time\":\"$.local_context.to_time\",\n" +
               "          \"slug\":\"$.local_context.slug\"\n" +
               "      }\n" +
               "   },\n" +
               "   \"input_format\":[\n" +
               "      {\n" +
               "          \"from_time\":\"$.local_context.from_time\",\n" +
               "          \"to_time\":\"$.local_context.to_time\",\n" +
               "          \"slug\":\"$.local_context.slug\"\n" +
               "      }\n" +
               "   ],\n" +
               "   \"output_format\":{\n" +
               "      \"properties\":{\n" +
               "        \"type\":\"array\",\n" +
               "          \"items\":{\n" +
               "              \"type\":\"object\",\n" +
               "              \"id\":{\n" +
               "                \"type\":\"integer\"\n" +
               "              },\n" +
               "              \"slug\":{\n" +
               "                \"type\":\"string\"\n" +
               "              }\n" +
               "          }\n" +
               "      }\n" +
               "   }\n" +
               "}\n" +
               "}\n";
       String res=ContextPrep.prepareContext(fullTest3);
       System.out.println(res);
        ContextValidator contextValidator=new ContextValidator(res);
        JsonAdapter job=contextValidator.validateContext();
        System.out.println(job.getDelegate().toString());
//       for(String key:job.getKeys()){
//           System.out.println(job.getByKey(key));
//       }
       //System.out.println(job.toString());
      // System.out.println(contextValidator.validateContext());
    }
}
