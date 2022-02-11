import React from "react"


export default function Home(){
    return (
    <>
        <br/>
        <div id="img">
            <img src={require('./img/aviao.jpg')} alt="Avião decolando" />
            </div><br/>
        <button type="button" id="btnCriar">Criar novo cliente</button><br/>
        <div  id="tabela">
        <table class="table">
            <thead className="menu">
                <tr id="tituloTabela">
                    <th>
                        Nome
                    </th>
                    <th>
                        Cidade de partida
                    </th>
                    <th>
                        Estado de partida
                    </th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        Wally West
                    </td>
                    <td>
                        São Paulo
                    </td>
                    <td>
                        São Paulo
                    </td>
                    <td>
                        <button type="button" id="btnEditar">Editar</button> |
                        <button type="button" id="btnDetalhes">Detalhes</button> |
                        <button type="button" id="btnDeletar">Deletar</button>
                    </td>
                </tr>
                <tr>
                    <td>
                        Erick
                    </td>
                    <td>
                        Carapicuíba
                    </td>
                    <td>
                        São Paulo
                    </td>
                    <td>
                        <button type="button" id="btnEditar">Editar</button> |
                        <button type="button" id="btnDetalhes">Detalhes</button> |
                        <button type="button" id="btnDeletar">Deletar</button>
                    </td>
                </tr>
            </tbody>
        </table>
        </div>
    </>

    )
}