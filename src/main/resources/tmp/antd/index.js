import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import { DatePicker, Table, LocaleProvider } from 'antd';
import ruRU from 'antd/lib/locale-provider/ru_RU';

const dataSource = [{
  key: '1',
  number: 'ОСТ-01',
  content: 'Проверка связи с отчетным документом',
  regDate: '01.03.2017',
  signer: 'Алкаев А.С.',
  docType: 'Входящий'
},{
  key: '2',
  number: 'ОСТ-11',
  content: '12',
  regDate: '10.03.2017',
  signer: 'Алкаев А.С.',
  docType: 'Входящий'
},{
  key: '3',
  number: 'ОСТ-91',
  content: 'План',
  regDate: '05.01.2017',
  signer: 'Алкаев А.С.',
  docType: 'Входящий'
},{
  key: '4',
  number: 'ОСТ-27',
  content: 'Информация проверки',
  regDate: '31.12.2016',
  signer: 'Алкаев А.С.',
  docType: 'Входящий'
},{
  key: '5',
  number: 'ОСТ-35',
  content: 'Пустое содержимое',
  regDate: '01.01.2014',
  signer: 'Алкаев А.С.',
  docType: 'Входящий'
}];

const columns = [{
  title: 'Рег.номер',
  dataIndex: 'number',
  key: 'number',
}, {
  title: 'Содержание',
  dataIndex: 'content',
  key: 'content',
}, {
  title: 'Рег.дата',
  dataIndex: 'regDate',
  key: 'regDate',
}, {
  title: 'Подписал',
  dataIndex: 'signer',
  key: 'signer',
}, {
  title: 'Тип документа',
  dataIndex: 'docType',
  key: 'docType',
}];

const App = () => (
	<LocaleProvider locale={ruRU}>
    <div style={{ margin: 100 }}>
      <h1>Жюрнал входяще-исходящих</h1>
      <hr /><br />      
      <DatePicker placeholder='Дата начала'/> <DatePicker placeholder='Дата окончания'/>
      <br /><br />
      <Table dataSource={dataSource} columns={columns} />
    </div>
    </LocaleProvider>
  );

ReactDOM.render(<App />, document.getElementById('root'));
