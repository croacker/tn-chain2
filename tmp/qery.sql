create or replace view dm_dbo.incoming_without_review_view as select
  croc_document_income_s.r_object_id r_object_id,
  croc_reg_number reg_number,
  croc_register_date reg_date,
  croc_doc_summary incoming_summary,
  croc_recipient_id addressee_id,
  croc_rec_last_name || ' ' || trim(croc_rec_first_name) || ' ' || trim(croc_rec_patronymic) addressee_full_description,
  croc_rec_last_name || ' ' || substr(croc_rec_first_name, 0, 1) || '.' || substr(croc_rec_patronymic, 0, 1) || '.' addressee_description,
  tn_correspondent_id,
  tn_correspondent_ost_id,
  croc_correspondents correspondent_description,
  croc_signed_by signed_by,
  croc_commission_s.owner_id resolution_author_id,
  author_user.croc_last_name || ' ' || substr(author_user.croc_first_name, 0, 1) || '.' || ' ' || substr(author_user.croc_patronymic, 0, 1)|| '.' resolution_author_description,
  author_user.croc_last_name || ' ' || author_user.croc_first_name || ' ' || author_user.croc_patronymic || ' ' author_full_description,
  croc_lifecycle_policy_s.state_name incoming_state,
  croc_commission_s.r_object_id resolution_id,
  croc_commission_s.added_on_state resolution_added_on_state,
  croc_commission_s.document_reviewer_id,
  croc_commission_s.resolution_kind resolution_kind,
  croc_commission_s.croc_content resolution_content,
  commission_performer.execution_completion_date performer_executed_date,
  croc_commission_s.control_date resolution_control_date,
  performer_employee_position.r_object_id performer_id,
  performer_user.croc_last_name || ' ' || substr(performer_user.croc_first_name, 0, 1) || '.' || substr(performer_user.croc_patronymic, 0, 1) || '.' performer_description,
  performer_user.croc_last_name || ' ' || performer_user.croc_first_name || ' ' || performer_user.croc_patronymic || ' ' performer_full_description,
  commission_performer_lifecycle.state_name performer_state,
  transfer_execution.employee_position_id transfer_execution_id,
  crc_dict_category_s.cabinet_id cabinet_id,
  is_transfer_execution is_transfer_execution,
  croc_document_topic_s.topic_id document_topic_id,
  topics_hierarchy_table.r_object_id topic_id,
  topics_hierarchy_table.folder_id topic_folder,
  topics_hierarchy_table.object_level topic_level,
  topics_hierarchy_table.first_level_order topic_order,
  topics_hierarchy_table.description topic_description,
  topics_hierarchy_table.full_description topic_full_description,
  'makeResolution' review_method
from dm_dbo.croc_document_income_r
  join dm_dbo.croc_document_income_s on croc_document_income_r.r_object_id = croc_document_income_s.r_object_id
  join dm_dbo.croc_document_common_s document_common on croc_document_income_s.r_object_id = document_common.r_object_id
  join dm_dbo.crc_dict_employee_position_s addressee_employee_position
    on croc_document_income_r.croc_recipient_id = addressee_employee_position.r_object_id
  join dm_dbo.croc_lifecycle_policy_s on croc_document_income_s.r_object_id = croc_lifecycle_policy_s.referenced_object_id
  join dm_dbo.croc_commission_s on croc_document_income_s.r_object_id = croc_commission_s.regcard_id
  join dm_dbo.crc_dict_employee_position_s author_employee_position on croc_commission_s.owner_id = author_employee_position.r_object_id
  join dm_dbo.crc_dict_user_s author_employee on author_employee_position.legacy_person = author_employee.r_object_id
  join dm_dbo.croc_dict_employee_s author_user on author_employee.legacy_user = author_user.r_object_id
  join dm_dbo.croc_commission_performer_s commission_performer on croc_commission_s.r_object_id = commission_performer.commission_id
  join dm_dbo.crc_dict_employee_position_s performer_employee_position
    on commission_performer.employee_position_id = performer_employee_position.r_object_id
  join dm_dbo.crc_dict_user_s performer_employee on performer_employee_position.legacy_person = performer_employee.r_object_id
  join dm_dbo.croc_dict_employee_s performer_user on performer_employee.legacy_user = performer_user.r_object_id
  left join dm_dbo.croc_transfer_execution_s transfer_execution on croc_document_income_s.r_object_id = transfer_execution.document_id
  join dm_dbo.croc_lifecycle_policy_s commission_performer_lifecycle
    on commission_performer.r_object_id = commission_performer_lifecycle.referenced_object_id
  join dm_dbo.crc_dict_category_s on croc_department_id = crc_dict_category_s.r_object_id
  left join dm_dbo.croc_document_topic_s on croc_document_income_s.r_object_id = croc_document_topic_s.document_id
  left join dm_dbo.topics_hierarchy_table on croc_document_topic_s.topic_id = topics_hierarchy_table.r_object_id
  where croc_recipient_id is not null
  and commission_performer_lifecycle.state_name not in('NewCommissionPerformer', 'CancelledCommissionPerformer')
union all
  select
  croc_document_income_s.r_object_id r_object_id,
  croc_reg_number reg_number,
  croc_register_date reg_date,
  croc_doc_summary incoming_summary,
  croc_recipient_id addressee_id,
  croc_rec_last_name || ' ' || trim(croc_rec_first_name) || ' ' || trim(croc_rec_patronymic) addressee_full_description,
  croc_rec_last_name || ' ' || substr(croc_rec_first_name, 0, 1) || '.' || substr(croc_rec_patronymic, 0, 1) || '.' addressee_description,
  tn_correspondent_id,
  tn_correspondent_ost_id,
  croc_correspondents correspondent_description,
  croc_signed_by signed_by,
  '0000000000000000' resolution_author_id,
  '' resolution_author_description,
  '' author_full_description,
  croc_lifecycle_policy_s.state_name incoming_state,
  '0000000000000000' resolution_id,
  '' resolution_added_on_state,
  '0000000000000000' document_reviewer_id,
  '' resolution_kind,
  '' resolution_content,
  to_date('01-01-01', 'DD-MM-YY') performer_executed_date,
  to_date('01-01-01', 'DD-MM-YY') resolution_control_date,
  '0000000000000000' performer_id,
  '' performer_description,
  '' performer_full_description,
  '' performer_state,
  transfer_execution.employee_position_id transfer_execution_id,
  crc_dict_category_s.cabinet_id cabinet_id,
  is_transfer_execution is_transfer_execution,
  croc_document_topic_s.topic_id document_topic_id,
  topics_hierarchy_table.r_object_id topic_id,
  topics_hierarchy_table.folder_id topic_folder,
  topics_hierarchy_table.object_level topic_level,
  topics_hierarchy_table.first_level_order topic_order,
  topics_hierarchy_table.description topic_description,
  topics_hierarchy_table.full_description topic_full_description,
  'sendToArchive' review_method
from dm_dbo.croc_document_income_r
  join dm_dbo.croc_document_income_s on croc_document_income_r.r_object_id = croc_document_income_s.r_object_id
  join dm_dbo.croc_document_common_s document_common on croc_document_income_s.r_object_id = document_common.r_object_id
  join dm_dbo.crc_dict_employee_position_s addressee_employee_position
    on croc_document_income_r.croc_recipient_id = addressee_employee_position.r_object_id
  join dm_dbo.croc_lifecycle_policy_s on croc_document_income_s.r_object_id = croc_lifecycle_policy_s.referenced_object_id
  left join dm_dbo.croc_transfer_execution_s transfer_execution on croc_document_income_s.r_object_id = transfer_execution.document_id
  join dm_dbo.crc_dict_category_s on croc_department_id = crc_dict_category_s.r_object_id
  left join dm_dbo.croc_document_topic_s on croc_document_income_s.r_object_id = croc_document_topic_s.document_id
  left join dm_dbo.topics_hierarchy_table on croc_document_topic_s.topic_id = topics_hierarchy_table.r_object_id
  where croc_recipient_id is not null
  and (croc_rec_no_review=0 or is_transfer_execution=0)
  and croc_lifecycle_policy_s.state_name in ('CaseMove', 'CloseDocument')
  and not exists (select croc_commission_s.r_object_id
  from dm_dbo.croc_commission_s where croc_document_income_s.r_object_id = croc_commission_s.regcard_id);