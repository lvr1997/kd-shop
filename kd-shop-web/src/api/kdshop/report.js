import request from '@/utils/request'

// 查询闲置举报列表
export function listReport(query) {
  return request({
    url: '/kdshop/report/list',
    method: 'get',
    params: query
  })
}

// 查询闲置举报详细
export function getReport(id) {
  return request({
    url: '/kdshop/report/' + id,
    method: 'get'
  })
}

// 新增闲置举报
export function addReport(data) {
  return request({
    url: '/kdshop/report',
    method: 'post',
    data: data
  })
}

// 修改闲置举报
export function updateReport(data) {
  return request({
    url: '/kdshop/report',
    method: 'put',
    data: data
  })
}

// 删除闲置举报
export function delReport(id) {
  return request({
    url: '/kdshop/report/' + id,
    method: 'delete'
  })
}

// 导出闲置举报
export function exportReport(query) {
  return request({
    url: '/kdshop/report/export',
    method: 'get',
    params: query
  })
}